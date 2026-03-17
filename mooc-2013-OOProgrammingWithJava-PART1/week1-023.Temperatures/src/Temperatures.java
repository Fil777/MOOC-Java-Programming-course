
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Double t = 0.0;
        
        while (t < 99.0) {
            System.out.print("Type a temperature: ");
            t = Double.parseDouble(reader.nextLine());
            if (t >= -30.0 && t <= 40.0) {
                Graph.addNumber(t);
            }
        }
        System.out.println("Close the graph!");
    }
}
