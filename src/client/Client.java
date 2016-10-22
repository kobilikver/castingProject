package client;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import users.User;

import java.lang.*;
import java.io.*;
import java.net.*;

/**
 * Created by kobi626 on 04/10/2016.
 */
public class Client {
    private User currentUser = null;
    private static Socket socket = null;

    private static class innerClient {
        public static final Client instance = new Client();
    }

    private Client(){
        // create client socket & connext to server
        try {
            this.socket = new Socket("localhost", 3636);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Singleton - return the instance of the client.Client.
    public static Client getInstance(){
        return Client.innerClient.instance;
    }

    public void tryToConnect(String username, String password) {
        try {
            // create json object output stream
            ObjectOutputStream outToServer = new ObjectOutputStream(socket.getOutputStream());

            // create json object input stream
            ObjectInputStream inFromServer = new ObjectInputStream(socket.getInputStream());

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
            data = (String)inFromServer.readObject();

            // convert JSON-string to a json object
            dataJson = gson.fromJson(data, JsonObject.class);

            // has command done successfully?
            boolean isSuccess = dataJson.get("success").getAsBoolean();

            if (isSuccess == true) {
                // connect has succeeded
            } else {
                // connect has failed!
                // exception handling
            }
            // close socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void send() {

    }

    public void receive() {

    }
}
