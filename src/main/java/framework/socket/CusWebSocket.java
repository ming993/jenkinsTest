package framework.socket;

import framework.config.MyEndpointConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@ServerEndpoint(value = "/cusWebSocket/{userId}", configurator = MyEndpointConfig.class)
public class CusWebSocket {

    // 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static final AtomicInteger OnlineCount = new AtomicInteger(0);

    // concurrent包的线程安全Set，用来存放每个客户端对应的ProductWebSocket对象。
    private static CopyOnWriteArraySet<CusWebSocket> webSocketSet = new CopyOnWriteArraySet<CusWebSocket>();

    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    private String userId;


    private Logger log = LoggerFactory.getLogger(CusWebSocket.class);

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(@PathParam("userId")String userId, Session session) {
        log.info("新客户端连入，用户id：" + userId);
        this.session = session;
        this.userId = userId;
        webSocketSet.add(this); // 加入set中
        addOnlineCount(); // 在线数加1
        if(userId!=null) {
            List<String> totalPushMsgs = new ArrayList<String>();
            totalPushMsgs.add(userId+"连接成功-"+"-当前在线人数为："+getOnlineCount());


            if(totalPushMsgs != null && !totalPushMsgs.isEmpty()) {
                totalPushMsgs.forEach(e -> sendMessage(e));
            }
        }

    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        log.info("一个客户端关闭连接");
        webSocketSet.remove(this); // 从set中删除
        subOnlineCount(); // 在线数减1
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message
     *            客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("用户发送过来的消息为："+message);
    }

    /**
     * 发生错误时调用
     */
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("websocket出现错误");
        error.printStackTrace();
    }

    public void sendMessage(String message) {
        try {
            this.session.getBasicRemote().sendText(message);
            log.info("推送消息成功，消息为：" + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 群发自定义消息
     */
    public static void sendInfo(String message) throws IOException {
        for (CusWebSocket productWebSocket : webSocketSet) {
            productWebSocket.sendMessage(message);
        }
    }

    /**
     * 特定人自定义消息
     */
    public static void sendInfo(String message, String userId) throws IOException {
        for (CusWebSocket productWebSocket : webSocketSet) {
            if(productWebSocket.userId.equals(userId.toString())){
                productWebSocket.sendMessage(message);
            }
        }
    }

    public static synchronized int getOnlineCount() {
        return OnlineCount.get();
    }

    public static synchronized void addOnlineCount() {
        OnlineCount.incrementAndGet(); // 在线数加1
    }

    public static synchronized void subOnlineCount() {
        OnlineCount.decrementAndGet(); // 在线数加1
    }
}