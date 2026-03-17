
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.print("Last number? ");
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is "+sum);
    }
}
