
public class Main {

    public static void main(String[] args) {
        Counter counter1 = new Counter(1, true);
        System.out.println(counter1.value());
        for (int i = 0; i < 2; i++) {
            counter1.increase();
            System.out.println(counter1.value());
        }
        for (int i = 0; i < 5; i++) {
            counter1.decrease();
            System.out.println(counter1.value());
        }
        System.out.println();
        
        Counter counter2 = new Counter();
        System.out.println(counter2.value());
        counter2.increase(100);
        System.out.println(counter2.value());
        counter2.increase(-150);
        System.out.println(counter2.value());
        counter2.decrease(150);
        System.out.println(counter2.value());
        System.out.println();
        
        
        Counter counter3 = new Counter(true);
        System.out.println(counter3.value());
        counter3.increase(100);
        System.out.println(counter3.value());
        counter3.decrease(-150);
        System.out.println(counter3.value());
        counter3.decrease(150);
        System.out.println(counter3.value());
        System.out.println();      

    }
}
