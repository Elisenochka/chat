import Server.ClientHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Romych on 13.04.2016.
 */
public class MainClass {


    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Print how you would like to act s/c?");
        if(reader.readLine()=="s"){
            new ClientHandler(new ServerSocket(8189));
        }
        else if(reader.readLine()=="c"){
            System.out.println("What is your name?");
            reader.readLine();
        }





    }
}
