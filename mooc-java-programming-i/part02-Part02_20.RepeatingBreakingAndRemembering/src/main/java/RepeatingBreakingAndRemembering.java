
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int entered = 0;
        double avg;
        int evens = 0;
        int odds = 0;
        System.out.println("Give numbers:");
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == -1) {
                break;
            }
            sum += read;
            entered++;
            if (read%2 == 0){
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + entered);
        System.out.println("Average: " + 1.0 * sum / entered);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
