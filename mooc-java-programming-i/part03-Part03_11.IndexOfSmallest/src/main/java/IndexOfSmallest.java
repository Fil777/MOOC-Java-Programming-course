
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int smallest = list.get(0);
        for (int num : list){
            if (smallest > num){
                smallest = num;
            }
        }
        System.out.println("Smallest number: " + smallest);
                
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (smallest == list.get(i)) {
                indexes.add(i);
            }
        }
        
        for (int index : indexes ) {
            System.out.println("Found at index " + index);
        };
        
    }
}
