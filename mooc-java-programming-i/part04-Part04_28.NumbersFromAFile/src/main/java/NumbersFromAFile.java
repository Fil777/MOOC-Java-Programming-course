
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read
            while (reader.hasNextLine()) {
                // we read one line
                String row = reader.nextLine();
                // we print the line that we read
                if (Integer.valueOf(row) >= lowerBound && Integer.valueOf(row) <= upperBound) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        System.out.println("Numbers: " + counter);
    }

}
