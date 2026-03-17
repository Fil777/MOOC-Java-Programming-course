
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String s = " ";

        System.out.print("Type a number: ");
        int r = Integer.parseInt(reader.nextLine());

        if (r <= 0) s = " not ";
        
        System.out.println("The number is" + s + "positive");
    }
}
