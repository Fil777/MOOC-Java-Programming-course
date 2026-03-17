
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int f = 1;
        System.out.println("Give a number: ");
        int read = Integer.parseInt(reader.nextLine());
        while (i < read) {
            i++;
            f *= i;
        }
        System.out.println("Factorial: " + f);
    }
}
