
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private Random random;
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        while (numbers.size() < 7) {
            int num = random.nextInt(40) + 1;
            if (!containsNumber(num)){
                numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        if (numbers.isEmpty()) {
            return false;
        }
        for (int num : numbers) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
