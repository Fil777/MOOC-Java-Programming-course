
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int n = Integer.parseInt(reader.nextLine());
            if (n == 0){
                break;
            } else if (n < 0) {
                System.out.println("Unsuitable number");
            } else {
                System.out.println(n * n);
            }
        }

    }
}
