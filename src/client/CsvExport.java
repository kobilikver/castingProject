package client;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by kobi626 on 22/10/2016.
 */
public class CsvExport {

    public void export() {
        CSVWriter writer = null;
        try {
            writer = new CSVWriter(new FileWriter("yourfile.csv"), '\t');
            // feed in your array (or convert your data to an array)
            String[] entries = "first#second#third".split("#");
            writer.writeNext(entries);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
