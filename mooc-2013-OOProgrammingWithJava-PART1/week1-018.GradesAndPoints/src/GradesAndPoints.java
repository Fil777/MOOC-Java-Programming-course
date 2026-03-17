
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int[] points = {0, 30, 35, 40, 45, 50, 60};
        String[] grades = {"failed", "1", "2", "3", "4", "5"};
        String s;

        System.out.print("Type the points [0-60]: ");
        int i = Integer.parseInt(reader.nextLine());

        if (i < points[0] || i > points[6]) return;
        else if (i < points[1]) s = grades[0];
        else if (i < points[2]) s = grades[1];
        else if (i < points[3]) s = grades[2];
        else if (i < points[4]) s = grades[3];
        else if (i < points[5]) s = grades[4];
        else s = grades[5];
        
        System.out.println("Grade: " + s);
    }
}
