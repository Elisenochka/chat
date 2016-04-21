import java.io.*;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Romych on 14.04.2016.
 */
public class ClientHandler extends Thread {

    Socket socket;
    BufferedReader reader;
    BufferedWriter writer;
    Window window;
    public static int clientsCount = 0;
    ServerSocket server;

    public void run(){
        try{
            server = new ServerSocket(8189);
            socket = server.accept();
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str ="";
            window=new Window("server",str);
            while(!str.equals("end")){
                //if(!reader.equals(null)){
                    str = reader.readLine();
                    //System.out.println(str);
                //}
            }
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
