
import java.util.Scanner;
import java.lang.Math;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int r = Integer.parseInt(reader.nextLine());
        System.out.println("Circumference of the circle: " + ((float)r * Math.PI * 2));
    }
}
