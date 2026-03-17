
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        if (n<0){
            n = n*-1;
        }
        System.out.println(n);
    }
}
