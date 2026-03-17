
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

// reading inputs
//        System.out.println("Give numbers: ");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

// which filter to use?        
        System.out.println("Print the average of the negative numbers"
                + " or the positive numbers? (n/p)");

// working out the average
// printing out the statistics
        double average;
        if (scanner.nextLine().equals("n")) {
            System.out.println("Average of the negative numbers: "
                    + inputs.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(n -> n < 0)
                            .average()
                            .getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: "
                    + inputs.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(n -> n > 0)
                            .average()
                            .getAsDouble());
        }

    }
}
