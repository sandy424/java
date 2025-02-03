import java.net.*;
import java.util.*;

public class Chatclient {
    public static void main(String[] args) throws Exception{
        //소켓 요청
        Socket socket = new Socket("192.168.219.108",1000);
        System.out.println("conntected to : " + socket.getInetAddress());
        System.out.println("접속 성공");

        Scanner scan = new Scanner(System.in);
        System.out.println("name: ");
        Sender sThread = new Sender(socket, scan.nextLine());
        Receiver rThread = new Receiver(socket);

        sThread.start();
        rThread.start();
        sThread.join();
        rThread.join();
        socket.close();
    }
}   