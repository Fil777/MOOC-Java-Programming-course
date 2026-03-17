
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a year: ");
        int y = Integer.parseInt(reader.nextLine());

        if (y < 0) {
            return;
        }

        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
