
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("First number? ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.print("Last number? ");
        int n2 = Integer.parseInt(reader.nextLine());
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
