
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int entered = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.parseInt(reader.nextLine());
            if (n == 0) {
                break;
            } else if (n > 0) {
                sum += n;
                entered++;
            }
        }
        if (entered == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (1.0 * sum / entered));
        }
    }
}
