
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Where to?");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Where from?");
        int n2 = Integer.parseInt(reader.nextLine());
        for (int i = n2; i <= n1; i++) {
            System.out.println(i);
        }
    }
}
