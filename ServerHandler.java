

import java.io.*;
import java.net.Socket;

/**
 * Created by Romych on 15.04.2016.
 */
public class ServerHandler extends Thread {
    Socket socket;
    BufferedReader reader;
    BufferedWriter writer;
    Window window;
    String name = "";



    public void run(){
        try {
            System.out.println("What is your name?");
            try{
            String name = reader.readLine();
        }
            catch (NullPointerException e){
                e.printStackTrace();
            }
            socket = new Socket("localhost", 8189);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str ="";
            window = new Window(name,str);
            while (true) {
                str = reader.readLine();

                if (str.equals("end"))
                break;
                }
            writer.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
        e.printStackTrace();
     }

    }
}
