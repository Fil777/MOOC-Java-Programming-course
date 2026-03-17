
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0;
        int p = 1;
        System.out.println("Type a number: ");
        int read = Integer.parseInt(reader.nextLine());
        while (i < read) {
            i++;
            p += (int)Math.pow(2, i); 
        }
        System.out.println("The result is " + p);
    
    }
}
