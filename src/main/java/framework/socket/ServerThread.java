package framework.socket;

import common.service.SocketService;
import framework.config.ApplicationContextRegister;

import java.io.*;
import java.net.Socket;


public class ServerThread extends Thread {
    Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    //线程执行的操作，响应客户端的请求
    @Override
    public void run() {
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        OutputStream os = null;
        PrintWriter pw = null;
        try {
            //获取输入流，并读取客户端信息
            is = socket.getInputStream();
            isr = new InputStreamReader(is, "UTF-8");
            br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {//循环读取客户端的信息
                SocketService socketService = ApplicationContextRegister.getBean(SocketService.class);
                socketService.receiveMessage(info);
                CusWebSocket.sendInfo(info);
            }
            socket.shutdownInput();//关闭输入流
            //获取输出流，响应客户端的请求
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("welcome!!");
            pw.flush();//调用flush()方法将缓冲输出
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if(pw != null){
                    pw.close();
                }
                if (os != null) {
                    os.close();
                }
                if (br != null) {
                    br.close();
                }
                if (isr != null) {
                    isr.close();
                }
                if (is != null) {
                    is.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
