import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;

/**
 * Created by Romych on 13.04.2016.
 */
public class MainClass {


    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Print how you would like to act s/c?");
        String answer = reader.readLine();
        if(answer.equals("s")){
            new ClientHandler().run();

        }
        else if(answer.equals("c")){
            new ServerHandler().run();

        }





    }
}
