
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        System.out.println("Until what? ");
        int read = Integer.parseInt(reader.nextLine());
        while (i < read) {
            i++;
            sum += i;
        }
        System.out.println("Sum is "+sum);
    }
}
