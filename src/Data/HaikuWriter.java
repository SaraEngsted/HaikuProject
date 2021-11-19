package Data;

import Analysis.HaikuPoem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class HaikuWriter {

    public static void savedHaikuPoems(HaikuPoem haiku) {
        try {
            File file = new File("Saved/SavedHaikuPoems.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write((haiku)+ "\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("File could not be found");
            e.printStackTrace();
        }
    }
}
