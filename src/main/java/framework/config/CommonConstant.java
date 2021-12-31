package framework.config;

public class CommonConstant {
    /**
     * 定时任务状态
     */
    public static Integer TASK_MNORMAL = 0;

    public static Integer TASK_DISABLE = 1;

    /**
     * 用户未读的WebSocket消息在Redis中存储的变量名的前缀
     */
    public static final String REDIS_UNREAD_MSG_PREFIX = "mq-websocket:unread_msg:";
}
