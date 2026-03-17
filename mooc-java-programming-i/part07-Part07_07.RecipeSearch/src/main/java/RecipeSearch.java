
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeCollection recipes = new RecipeCollection();
        UserInterface ui = new UserInterface(scanner, recipes);
        ui.run();
    }

}
