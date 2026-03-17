
import java.util.Scanner;

/**
 *
 * @author Fil
 */
public class UserInterface {

    private BirdsCatalog birds;
    private Scanner scan;

    public UserInterface(Scanner scanner, BirdsCatalog birds) {
        this.scan = scanner;
        this.birds = birds;
    }

    public void run() {
        String birdName;
        while (true) {
            System.out.println("? ");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("All")) {
                birds.printAll();
            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                birdName = scan.nextLine();
                if (!birdName.isEmpty()) {
                    Bird bird = birds.getBird(birdName);
                    if (bird == null) {
                        System.out.println("Not a bird!");
                    } else {
                        birds.printOne(bird);
                    }
                }
            } else if (command.equals("Add")) {
                System.out.println("Name: ");
                birdName = scan.nextLine();
                if (!birdName.isEmpty()) {
                    System.out.println("Name in Latin: ");
                    String birdNameLatin = scan.nextLine();
                    birds.addBird(new Bird(birdName, birdNameLatin));
                }
            } else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                birdName = scan.nextLine();
                if (!birdName.isEmpty()) {
                    Bird bird = birds.getBird(birdName);
                    if (bird == null) {
                        System.out.println("Not a bird!");
                    } else {
                        birds.addBirdObservation(bird);
                    }
                }
            }
        }
    }
}

