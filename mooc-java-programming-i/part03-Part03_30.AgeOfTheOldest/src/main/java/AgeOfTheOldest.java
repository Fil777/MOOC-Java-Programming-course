
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = -1;
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String[] parts = text.split(",");
            int age = Integer.valueOf(parts[1]);
            if (maxAge < age) {
                maxAge = age;
            }
        }
        System.out.println("Age of the oldest: " + maxAge);

    }
}
