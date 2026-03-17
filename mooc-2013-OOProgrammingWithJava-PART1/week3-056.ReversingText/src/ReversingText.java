
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String s = "";
        int i = text.length();
        while (i > 0){
            i--;
            s = s + text.charAt(i);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
