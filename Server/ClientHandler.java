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

    public ClientHandler(ServerSocket serverSocket){
        this.server = serverSocket;
        try{
            socket = server.accept();
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void run(){
        try{
            //reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
            //writer = new PrintWriter(server.getOutputStream());
            writer.println("Hello, user");
            String str ="";
            while(!str.equals("end")){
                if(!reader.equals(null)){
                    str = reader.readLine();
                    System.out.println(str);
                }
            }
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
