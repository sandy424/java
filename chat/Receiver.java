import java.io.*;
import java.net.*;

public class Receiver extends Thread{
    Socket socket;

    public Receiver(Socket socket) {
        this.socket = socket;
    }
    public void run() {
        InputStream in;
        BufferedReader reader;
        try {
            while (true) { 
                String message;
                in = socket.getInputStream();
                reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                if((message = reader.readLine()) != null) {
                    if(message.equals("quit")) break;
                    System.out.println(message);
                }
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
