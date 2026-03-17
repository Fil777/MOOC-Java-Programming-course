
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1 = reader.nextLine();
        System.out.print("Enter the second string:");
        String s2 = reader.nextLine();
        if (s1.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
