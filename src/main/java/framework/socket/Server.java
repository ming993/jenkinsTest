package framework.socket;

import org.springframework.stereotype.Component;



@Component
public class Server {
    public void run(int port){
            System.out.println("***服务器即将启动，等待客户端的连接***");
    }
}
