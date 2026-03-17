
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.parseInt(reader.nextLine());
            if (n == 4) {
                break;
            }
//        System.out.println(n);
        }
    }
}
