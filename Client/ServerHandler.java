package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Romych on 15.04.2016.
 */
public class ServerHandler extends Thread {
    Socket socket;
    BufferedReader reader;
    PrintWriter writer;



    public void run(){
        try{
            String name = reader.readLine();
            socket = new Socket("localhost", 8189);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            while (true) {
                String str = reader.readLine();
                writer.println(name+":"+str);
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

