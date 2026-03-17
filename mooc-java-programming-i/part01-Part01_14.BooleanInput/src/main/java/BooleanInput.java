
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        System.out.println("Write something:");
        
        boolean b = Boolean.parseBoolean(scan.nextLine());
        
        System.out.println("True or false? " + b);
        
    }
}
