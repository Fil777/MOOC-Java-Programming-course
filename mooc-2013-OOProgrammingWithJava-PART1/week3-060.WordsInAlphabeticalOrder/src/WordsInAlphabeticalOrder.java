
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String text = "";
        
        while (true){
            System.out.print("Type a word: ");
            text = reader.nextLine();
            if (text.isEmpty()) break;
            words.add(text);
        }
        
        System.out.println("You typed the following words:");      
        Collections.sort(words);
        for (String s : words) System.out.println(s);
    }
}
