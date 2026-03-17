
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                String year = " year";
                if (!(age == 1)) {
                    year += "s";
                }
                System.out.println(name + ", age: " + age + year);
            }
        } catch (Exception IOException) {
            System.out.print("ERROR: " + IOException.getMessage());
        }
    }
}
