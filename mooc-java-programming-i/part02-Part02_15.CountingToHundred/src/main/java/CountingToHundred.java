
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = n; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
