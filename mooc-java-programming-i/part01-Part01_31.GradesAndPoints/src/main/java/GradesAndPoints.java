
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] points = {0, 50, 60, 70, 80, 90, 100};
        String[] grades = {"impossible!", "failed", "1", "2", "3", "4", "5", "incredible!"};

        System.out.println("Give points [0-100]:");
        int i = Integer.parseInt(reader.nextLine());

        String s;
        if (i < points[0]) {
            s = grades[0];
        } else if (i < points[1]) {
            s = grades[1];
        } else if (i < points[2]) {
            s = grades[2];
        } else if (i < points[3]) {
            s = grades[3];
        } else if (i < points[4]) {
            s = grades[4];
        } else if (i < points[5]) {
            s = grades[5];
        } else if (i <= points[6]) {
            s = grades[6];
        } else {
            s = grades[7];
        }

        System.out.println("Grade: " + s);
    }
}
