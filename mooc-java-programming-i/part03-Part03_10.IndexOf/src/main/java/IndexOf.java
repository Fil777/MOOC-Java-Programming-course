
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println();
        
        System.out.println("Search for? ");
        int num = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (num == list.get(i)) {
                indexes.add(i);
            }
//            System.out.println(num+" "+i+" "+list.get(i)+" "+list.size());
        }
        
        for (int index : indexes ) {
            System.out.println(num + " is at index " + index);
        };
    }
}
