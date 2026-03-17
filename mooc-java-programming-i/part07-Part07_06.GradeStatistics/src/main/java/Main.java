
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        String input = "-42\n24\n42\n72\n80\n52\n-1\n";
//        String input = "102\n-4\n33\n77\n99\n1\n-1\n";
//        Scanner scanner = new Scanner(input);
        Scanner scanner = new Scanner(System.in);
        DataStore points = new DataStore();
        UserInterface ui = new UserInterface(scanner, points);
        ui.run();
    }
}
