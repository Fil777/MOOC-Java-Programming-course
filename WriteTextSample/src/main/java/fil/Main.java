package fil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String fileName = "dataOut.txt";
        System.out.println(writeText(fileName));
    }

    public static String writeText(String fileName) {
        try (FileWriter fw = new FileWriter(new File(fileName))) {
            fw.write("humpty dumpty\nhello everybody!\nFINE");
        } catch (IOException ex) {
            return ex.getMessage();
        }
        return "SAVED";
    }
}
