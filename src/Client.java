import java.lang.*;
import java.io.*;
import java.net.*;

/**
 * Created by kobi626 on 04/10/2016.
 */
public class Client {
    public static void main(String args[]) throws Exception {
        String answer = null;

        // create client socket & connext to server
        Socket socket = new Socket("localhost", 3636);

        // create output stream attached to socket
        DataOutputStream outToServer = new DataOutputStream(socket.getOutputStream());

        // create input stream attached to socket
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // send line to server
        outToServer.writeBytes("hi" + '\n');

        // read answer from server
        answer = inFromServer.readLine();

        // print server's answer
        System.out.println("Server's Answer:" + answer);

        // close socket
        socket.close();
    }
}
