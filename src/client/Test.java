package client;

import com.opencsv.CSVReader;
import users.Admin;
import users.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by kobi626 on 18/10/2016.
 */
public class Test {

    public static void main(String[] args) {
//        Boolean result = Client.getInstance().tryToConnect("kobi", "kobkob");
        Admin ad = new Admin();
        User newUser = new User(0, "roi", "roiroi", "roi peretz", "roip@gmail.com");
        ad.addUser(newUser);
//        CSVReader reader = null;
//        String [] nextLine;
//        try {
//            reader = new CSVReader(new FileReader("/Users/kobi626/IdeaProjects/castingProject/src/client/test.csv"));
//            while ((nextLine = reader.readNext()) != null) {
//                // nextLine[] is an array of values from the line
//                System.out.println(nextLine[0] + " " + nextLine[1] + " " + nextLine[2]);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }  catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
