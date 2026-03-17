import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random random = new Random();
        int stackLimit = 7;
        int numberLimit = 39;
        int number = -1;
        int i = 0;
        while (i < stackLimit){
            number = random.nextInt(numberLimit)+1;
            if (!containsNumber(number)) {
                numbers.add(number);
                i++;
            }
        }        
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
