
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int n2 = Integer.parseInt(scanner.nextLine());
        if (n1 == n2) {
            System.out.println("The numbers are equal!");
        } else if (n1 > n2) {
            System.out.println("Greater number is: "+n1);
        } else {
            System.out.println("Greater number is: "+n2);
        }
    }
}
