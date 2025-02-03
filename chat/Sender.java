import java.io.*;
import java.net.*;
import java.util.*;

public class Sender extends Thread{
    Socket socket;
    String name;
    Scanner scan = new Scanner(System.in);

    public Sender(Socket socket, String name) {
        this.socket = socket;
        this.name = name;
    }
    
    public void run() {
        try {
            OutputStream out = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out, "UTF-8")),true);
            writer.println("/init_name " + name);
            while (true) { 
                String message = scan.nextLine();
                if(message.equals("quit")) {
                    writer.println(message);
                    break;
                }
                writer.println(name + " : " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
