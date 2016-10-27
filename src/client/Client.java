package client;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import users.User;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.nio.channels.SocketChannel;

/**
 * Created by kobi626 on 04/10/2016.
 */
public class Client {
    private User currentUser = null;
    private static SocketChannel socket = null;
    private Gson gson = new Gson();
    private ObjectOutputStream outToServer;
    private ObjectInputStream inFromServer;

    private static class innerClient {
        public static final Client instance = new Client();
    }

    private Client(){
        // Read config info
        String filePath = new File("").getAbsolutePath();
        String fullPath = filePath.concat("\\src\\client\\config.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(fullPath)))
        {
            StringBuilder sb = new StringBuilder();
            // Read host
            String line = br.readLine();
            String host = line;
            // Read port
            line = br.readLine();
            int intPort = Integer.parseInt(line);

            // create client socket & connext to server
            this.socket = SocketChannel.open();
            this.socket.configureBlocking(true);
            this.socket.connect(new InetSocketAddress(host, intPort));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // create json object output stream
        try {
            outToServer = new ObjectOutputStream(socket.socket().getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Singleton - return the instance of the client.Client.
    public static Client getInstance(){
        return Client.innerClient.instance;
    }

    public Boolean tryToConnect(String username, String password) {
        try {
            // ********** SEND **********
            JsonObject dataJson = new JsonObject();
            dataJson.addProperty("clientCommand", 0);

            Gson gson = new Gson();
            User user = new User(username, password);

            // convert User object to JSON-string
            String data = gson.toJson(user);

            dataJson.addProperty("data", data);
            // convert dataJson object to JSON-string
            String finalData = gson.toJson(dataJson);

            // send JSON-string to server
            outToServer.writeObject(finalData);

            // ********** RECEIVE **********
            // get the server's answer as JSON-string
            String jsonData = (String) inFromServer.readObject();

            // convert JSON-string to a json object
            Answer answer = gson.fromJson(jsonData, Answer.class);
            int type = answer.getType();

            if (type == 0) {
                // exception
            } else if (type == 1) {
                // success
                this.currentUser = gson.fromJson(answer.getData(), User.class);
                System.out.println("success");
            }
//            // close socket
//            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void sendToServer(String command) {
        Thread thread = new Thread(){
            public void run(){
                // send JSON-string to server
                try {
                    outToServer.writeObject(command);
                    outToServer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public void receiveFromServer() {
        Thread thread = new Thread(){
            public void run(){
                // get the server's answer as JSON-string
                try {
                    System.out.println("woohooo");
                    String jsonData = null;
                    // create json object input stream
                    inFromServer = new ObjectInputStream(socket.socket().getInputStream());
                    jsonData = (String) inFromServer.readObject();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
