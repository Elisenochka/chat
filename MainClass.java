import Server.ClientHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Romych on 13.04.2016.
 */
public class MainClass {
    public static void main(String[] args) {


        try{
            while(true){
                Socket socket = server.accept();
                new Thread(new ClientHandler(socket)).start();
                System.out.println("Client connected");

            }
            System.out.println("Connection is open");

            server.close();


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
