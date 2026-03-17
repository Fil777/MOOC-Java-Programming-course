
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        System.out.println("How many days would you like to convert to seconds?");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num * secondsInMinute * minutesInHour * hoursInDay);
    }
}
