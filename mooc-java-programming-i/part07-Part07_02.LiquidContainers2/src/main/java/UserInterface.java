
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fil
 */
public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface(Container first, Container second, Scanner scanner) {
        this.first = first;
        this.second = second;
        this.scanner = scanner;
    }

    public void run() {
        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            System.out.println("> ");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                System.out.println("ignored");
                continue;
            }
            if (command.equals("add")) {
                first.add(amount);
            } else if (command.equals("move")) {
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
            } else if (command.equals("remove")) {
                second.remove(amount);
            } else {
                System.out.println("not a command");
            }
        }

    }
}
