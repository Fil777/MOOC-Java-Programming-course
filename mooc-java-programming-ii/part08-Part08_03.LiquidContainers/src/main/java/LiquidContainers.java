
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
        while (true) {
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                amount = 0;
            }
            if (command.equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            } else if (command.equals("move")) {
                int realAmount = first;
                first -= amount;
                if (first < 0) {
                    first = 0;
                    amount = realAmount;
                }
                second += amount;
                if (second > 100) {
                    second = 100;
                }
            } else if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            } else {
                System.out.println("not a command");
            }
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }

}
