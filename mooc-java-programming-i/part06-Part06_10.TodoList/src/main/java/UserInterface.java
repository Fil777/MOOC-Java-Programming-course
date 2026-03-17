
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

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                this.list.add(task);
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int index = Integer.parseInt(scanner.nextLine());
                if (index > 0 && index <= this.list.size()) {
                    this.list.remove(index);
                }
            } else if(command.equals("list")){  
                this.list.print();
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println(
                "Bye bye!");
    }

}
