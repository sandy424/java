import java.io.*;
import java.net.*;
import java.util.*;

public class ServerThread extends Thread{
    Socket socket;
    static ArrayList<Socket> arraysockets = new ArrayList<Socket>();
    String nick = "";

    public ServerThread(Socket socket) {
        this.socket = socket;
        arraysockets.add(socket);
    }

    public void run() {
        try {
            while(true) {
                String message;
                InputStream in = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            
                while((message = reader.readLine()) != null) {
                    if(message.equals("quit")) {
                        PrintWriter write = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8")),true);
                        write.println(message);
                        break;
                    }
                    if(message.startsWith("init_name ")) {
                        nick = message.split(" ")[1];
                        for(int i=0; i<arraysockets.size(); i++) {
                            OutputStream out = arraysockets.get(i).getOutputStream();
                            PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(out, "UTF-8")),true);
                            writer.println(nick + "이 입장하였습니다.");
                            writer.flush();
                        }
                        continue;
                    }
                    System.out.println(message);
                }
            }
                        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
    

