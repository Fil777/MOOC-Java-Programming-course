
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a number:");
        int x = Integer.parseInt(reader.nextLine());
        
        String s = " is odd.";
        if (x % 2 == 0) {
            s = " is even.";
        }
        
        System.out.println("Number " + x + s);

    }
}
