
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Shall we carry on?");
            String s = reader.nextLine();
            if (s.equals("no")) {
                break;
            }
        }
    }
}
