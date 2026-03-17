
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BirdsCatalog birds = new BirdsCatalog();
        ObservationsCatalog observations = new ObservationsCatalog();

        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("? ");
            String command = reader.nextLine();
            if (command.equalsIgnoreCase("Quit")) break;
            else if (command.equalsIgnoreCase("Add"))
                addNewBird(reader, birds, observations);
            else if (command.equalsIgnoreCase("Observation"))
                addNewObservation(reader, birds, observations);
            else if (command.equalsIgnoreCase("Show"))
                showOneBirdStatistics(reader, birds, observations);
            else if (command.equalsIgnoreCase("Statistics"))
                showAllStatistics(observations);
            else System.out.println("Is not a command!");
        }
    }

    public static void addNewBird(
            Scanner reader, BirdsCatalog birds, ObservationsCatalog observations){
        System.out.print("Name: ");
        String birdName = capitalize(reader.nextLine().trim());
        if (birds.contains(birdName)) {
            System.out.println("Already in Catalog.");
            return;
        }
        System.out.print("Latin Name: ");
        String birdLatinName = capitalize(reader.nextLine().trim());
        Birds bird = new Birds(birdName, birdLatinName);
        birds.add(bird);
        observations.initialize(bird);
    }

    public static void addNewObservation(
            Scanner reader, BirdsCatalog birds, ObservationsCatalog observations){
        System.out.print("What was observed? ");
        String birdName = reader.nextLine();
        Birds bird = birds.getBird(birdName);
        if (bird == null) {
            System.out.println("Is not a bird!");
            return;
        }
        observations.add(bird);
    }

    public static void showOneBirdStatistics(
            Scanner reader, BirdsCatalog birds, ObservationsCatalog observations){
        System.out.print("What? ");
        String birdName = reader.nextLine();
        if (!birds.contains(birdName)) {
            System.out.println("Is not a bird!");
            return;
        }
        System.out.println(observations.getBirdStatistics(birdName));
    }

    public static void showAllStatistics(ObservationsCatalog observations){
        for (int m = 0; m < observations.size(); m++){
            System.out.println(observations.getBirdStatistics(m));
        }
    }

    public static String capitalize(String str) {
        return str;
//        if (str == null || str.isEmpty()) {
//            return str;
//        }
//        String[] parts = str.trim().split("[,\\s]+");
//        String result = "";
//        for (String word : parts) {
//            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
//        }
//        return result.trim();
    }
}
