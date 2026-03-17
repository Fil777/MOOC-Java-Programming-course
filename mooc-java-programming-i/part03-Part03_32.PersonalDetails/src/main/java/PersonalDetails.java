
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int maxLen = 0;
        int sumYears = 0;
        int totalNames = 0;
                
        while (true) {
            String text = scanner.nextLine();
            if (text.isEmpty()) {
                break;
            }
            totalNames++;
            String[] parts = text.split(",");
            sumYears += Integer.valueOf(parts[1]);
            if (maxLen < parts[0].length()) {
                maxLen = parts[0].length();
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sumYears / totalNames));
    }
}
