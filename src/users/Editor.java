package users;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import persistents.Project;
import persistents.Talent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobi626 on 13/10/2016.
 */
public class Editor extends User {

    public void addTalent(Talent talent) {
        Gson gson = new Gson();
        // parse the talent class into JSON-string
        String data = gson.toJson(talent);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 1);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void addProject(Project project) {
        Gson gson = new Gson();
        // parse the project class into JSON-string
        String data = gson.toJson(project);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 2);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void removeTalent(int id) {
        Gson gson = new Gson();

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 3);
        dataJson.addProperty("id", id);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void removeProect(int pid) {
        Gson gson = new Gson();

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 4);
        dataJson.addProperty("pid", pid);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void updateTalent(Talent talent) {
        Gson gson = new Gson();
        // parse the talent class into JSON-string
        String data = gson.toJson(talent);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 5);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void updateProject(Project project) {
        Gson gson = new Gson();
        // parse the project class into JSON-string
        String data = gson.toJson(project);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 6);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void importTalents(ArrayList<Talent> talents) {
        Gson gson = new Gson();
        // parse the talents list class into JSON-string
        String data = gson.toJson(talents);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 9);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }

    public void importProject(ArrayList<Project> projects) {
        Gson gson = new Gson();
        // parse the projects list class into JSON-string
        String data = gson.toJson(projects);

        JsonObject dataJson = new JsonObject();
        dataJson.addProperty("clientCommand", 10);
        dataJson.addProperty("data", data);

        String command = gson.toJson(dataJson);
        //client.sendToServer(command);

        // get answer if succeeded
    }
}
