
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAge = -1;
        String name = "";
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            String[] parts = text.split(",");
            int age = Integer.valueOf(parts[1]);
            if (maxAge < age) {
                maxAge = age;
                name = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
