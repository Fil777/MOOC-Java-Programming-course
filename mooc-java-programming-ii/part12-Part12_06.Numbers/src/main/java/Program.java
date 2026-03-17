
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("How many random numbers should be printed?");
        int num = Integer.parseInt(scanner.nextLine());
        while (num > 0){
            System.out.println(rnd.nextInt(11));
            num--;
        }
        
    }
}
