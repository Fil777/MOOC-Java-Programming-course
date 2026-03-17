
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int entered = 0;
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.parseInt(reader.nextLine());
            if (n == 0) {
                break;
            } else if (n < 0) {
                entered++;
            }
        }
        System.out.println("Number of negative numbers: " + entered);
    }
}
