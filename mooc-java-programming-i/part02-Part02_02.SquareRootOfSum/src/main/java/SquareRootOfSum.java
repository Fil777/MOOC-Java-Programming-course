
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        int n2 = Integer.parseInt(reader.nextLine());
        System.out.println(Math.sqrt(n1 + n2));
    }
}
