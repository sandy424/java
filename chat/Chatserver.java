import java.net.*;

public class Chatserver{
    public static void main(String[] args) throws Exception {

        int port = 1000;

        System.out.println("서버가 시작되었습니다.");
        
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("서버 열림");
        while (true) { 
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트 연결: " + socket.getLocalAddress());

            Thread serverThread = new ServerThread(socket);
            serverThread.start();
        }
    }
}