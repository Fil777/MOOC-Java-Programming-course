
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        int n2 = Integer.parseInt(reader.nextLine());
        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else {
            System.out.println(n1 + " is smaller than " + n2);
        }
    }
}
