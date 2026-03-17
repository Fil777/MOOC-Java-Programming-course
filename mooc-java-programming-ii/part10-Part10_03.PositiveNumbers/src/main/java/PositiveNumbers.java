
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(-3);
        values.add(-4);
        values.add(1);
        values.add(-9);
        values.add(5);
        values.add(-5);
        
        System.out.println(values);
        System.out.println(positive(values));
        
    }
    
    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
