
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        //System.out.println(numberDrawn);
        int read = -1;
        int guesses = 0;
        while (!(read == numberDrawn)) {
            System.out.print("Guess a number: ");
            read = Integer.parseInt(reader.nextLine());
            guesses++;
            if (read > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + guesses);
            } else if (read < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + guesses);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
