
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> divisibleAlt(ArrayList<Integer> numbers) {
        ArrayList<Integer> res = new ArrayList<>(); 
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> res.add(n));
        numbers.stream()
                .filter(n -> n % 3 == 0)
                .forEach(n -> res.add(n));
        numbers.stream()
                .filter(n -> n % 5 == 0)
                .forEach(n -> res.add(n));

        return res;

    }
    

}
