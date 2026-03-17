
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        String read = readFile(file, list);

        if (read.isEmpty()) {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();

            if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } else {
            System.out.println("Reading the file " + file + " failed.");
        }
    }

    public static String readFile(String fileName, ArrayList<String> list) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                list.add(row);
            }
        } catch (Exception e) {
            return e.getMessage();
        }
        return "";
    }

}
