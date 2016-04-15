package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Romych on 14.04.2016.
 */
public class ClientHandler extends Thread {

    Socket socket;
    BufferedReader reader;
    PrintWriter writer;
    public static int clientsCount = 0;
    ServerSocket server;
    System.out.println("Port 8189 Listening. Waiting for Connection");

    public ClientHandler(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try{
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            writer.println("Hello, user");
            String str ="";
            while(str.equals("end"){
                if(reader.e){
                    str = reader.readLine();
                    System.out.println(str);
                    writer.println("Echo: "+str);
                }
            }
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}