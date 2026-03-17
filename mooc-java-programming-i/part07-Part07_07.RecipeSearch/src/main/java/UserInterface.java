
import java.util.Scanner;

/**
 *
 * @author Fil
 */
public class UserInterface {

    private RecipeCollection recipes;
    private Scanner scan;

    public UserInterface(Scanner scanner, RecipeCollection recipes) {
        this.scan = scanner;
        this.recipes = recipes;
    }

    public void run() {
        System.out.println("\nFile to read: ");
        String fileName = scan.nextLine();

        recipes.loadRecipes(fileName);

        System.out.println("\nCommands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("\nEnter command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes: ");
                recipes.printList();
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchText = scan.nextLine();
                if (!searchText.isEmpty()) {
                    System.out.println("\nRecipes: ");
                    recipes.printList(searchText);
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                String searchTime = scan.nextLine();
                if (!searchTime.isEmpty()) {
                    System.out.println("\nRecipes: ");
                    recipes.printList(Integer.valueOf(searchTime));
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchText = scan.nextLine();
                if (!searchText.isEmpty()) {
                    System.out.println("\nRecipes: ");
                    recipes.printList("ingredient", searchText);
                }
            }
        }
    }
}
