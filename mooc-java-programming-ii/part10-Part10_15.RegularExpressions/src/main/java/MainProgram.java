
public class MainProgram {

    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println("1: " + checker.isDayOfWeek("tue"));
        System.out.println("1: " + checker.isDayOfWeek("abc"));
        System.out.println("2: " + checker.allVowels("oi"));
        System.out.println("2: " + checker.allVowels("queue"));
        System.out.println("3: " + checker.timeOfDay("17:23:55"));
        System.out.println("3: " + checker.timeOfDay("abc"));
        System.out.println("3: " + checker.timeOfDay("33:33:33"));
        System.out.println("3: " + checker.timeOfDay("29:33:33"));
        System.out.println("3: " + checker.timeOfDay("17:23:65"));
        System.out.println("3: " + checker.timeOfDay("24:41:16"));
        
    }
}
