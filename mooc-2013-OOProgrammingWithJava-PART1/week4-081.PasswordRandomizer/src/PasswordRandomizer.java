
import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        if (length >= 0) {
            this.length = length;
            random = new Random();
        }
    }

    public String createPassword() {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        int number;
        String password = "";
        for (int i = 0; i < length; i++) {
            number = random.nextInt(symbols.length());
            char symbol = symbols.charAt(number);
            password = password + symbol;
        }
        return password;
    }
}
