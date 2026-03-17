
import java.util.Scanner;
import java.lang.Math;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger number of the two numbers given was: " + Math.max(a, b));
    }
}
