
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputList = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            inputList.add(input);
        }
        inputList.stream()
                .filter(n -> n > 0 && n < 6)
                .forEach(s -> System.out.println(s));
    }
}
