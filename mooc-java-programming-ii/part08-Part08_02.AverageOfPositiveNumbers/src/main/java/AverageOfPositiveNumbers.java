
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int tot = 0;
        while (true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            } else if (num > 0){
                sum += num;
                tot++;
            }
        }
        if (tot > 0){
            System.out.println(1.0 * sum / tot);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
