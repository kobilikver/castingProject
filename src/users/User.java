package users;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import persistents.Talent;

import java.util.List;

/**
 * Created by kobi626 on 13/10/2016.
 */
public class User {

    public User() {}

    private int permission;
    private String username = "";
    private String password = "";
    private String fullname = "";
    private String email = "";

    public User(int permission, String username, String password, String fullname, String email) {
        this.permission = permission;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFullname() {
        return this.fullname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setUsername(String username1) {
        this.username = username1;
    }

    public void setPassword(String password1) {
        this.password = password1;
    }

    public void setFullname(String fullname1) {
        this.fullname = fullname1;
    }

    public void setEmail(String email1) {
        this.email = email1;
    }

    public List<Talent> getTalents() {
        Gson gson = new Gson();
        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 7);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer
        return null;
    }

    public List<Talent> getProjects() {
        Gson gson = new Gson();
        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 8);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer
        return null;
    }
}
