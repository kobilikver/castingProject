package client;

import com.opencsv.CSVReader;
import persistents.Project;
import persistents.Talent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kobi626 on 20/10/2016.
 */
public class CsvImport {
    private CSVReader reader = null;
    private String [] nextLine;

    public CsvImport() {

    }

    public List<Talent> parseTalent(String path) {
        ArrayList<Talent> talents = new ArrayList<Talent>();
        try {
            reader = new CSVReader(new FileReader(path));
            while ((nextLine = reader.readNext()) != null) {
                // parse one talent
                Talent newTalent = new Talent();
                newTalent.setFirstName(nextLine[0]);
                newTalent.setLastName(nextLine[1]);
                // ....

                // add new talent to list
                talents.add(newTalent);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        // Until now read all talents successfully
        return talents;
    }

    public List<Project> parseProject(String path) {
        ArrayList<Project> projects = new ArrayList<Project>();
        try {
            reader = new CSVReader(new FileReader(path));
            while ((nextLine = reader.readNext()) != null) {
                // parse one project
                Project newProject = new Project();
                newProject.setTitleHebrew(nextLine[0]);
                newProject.setTitleEnglish(nextLine[1]);
                // ....

                // add new project to list
                projects.add(newProject);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        // Until now read all projects successfully
        return projects;
    }

}
