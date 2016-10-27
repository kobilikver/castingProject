package users;

import client.Client;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by kobi626 on 13/10/2016.
 */
public class Admin extends Editor {

    public Admin() {
    }

    public void addUser(User newUser) {
        Gson gson = new Gson();
        // parse the user class into JSON-string
        String data = gson.toJson(newUser);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 11);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        // send command to server
        Client.getInstance().sendToServer(command);
        Client.getInstance().receiveFromServer();
    }

    public void removeUser(String username) {
        Gson gson = new Gson();

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 12);
        dataJson.addProperty("data", username);

        String command = gson.toJson(dataJson);
        // client.sendToServer(command);

        // get answer if succeeded
    }

    public void resetPass(User resetMe) {
        Gson gson = new Gson();
        // parse the user class into JSON-string
        String data = gson.toJson(resetMe);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 13);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        // client.sendToServer(command);

        // get answer if succeeded
    }

    public List<User> getAllUsers() {
        Gson gson = new Gson();
        Type type = null;

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 14);

        String command = gson.toJson(dataJson);
        // send command to server
        // client.sendToServer(command);

        // receive answer from server
        //String answer = client.receiveFromServer();
        // DELETE THE NEXT LINEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
        String answer = "";
        JsonObject answerJson = gson.fromJson(answer, JsonObject.class);
        // "type" is helping parsing different objects from json
        type = new TypeToken<List<User>>(){}.getType();
        List<User> users = gson.fromJson(answerJson.get("users"), type);
        return users;
    }

    public void setPermission(User setMe, int newPermission) {
        Gson gson = new Gson();
        // parse the user class into JSON-string
        String data = gson.toJson(setMe);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 5);
        dataJson.addProperty("data", data);
        dataJson.addProperty("permission", newPermission);

        String command = gson.toJson(dataJson);
        // client.sendToServer(command);

        // get answer if succeeded
    }
}
