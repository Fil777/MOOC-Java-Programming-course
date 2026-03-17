
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int entered = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.parseInt(reader.nextLine());
            if (n == 0) {
                break;
            }
            entered++;

        }
        System.out.println("Number of numbers: " + entered);
    }
}
