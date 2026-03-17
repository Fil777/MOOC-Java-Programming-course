
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String s = " is odd.";
        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        if (x % 2 == 0) {
            s = " is even.";
        }
        
        System.out.println("Number " + x + s);

    }
}
