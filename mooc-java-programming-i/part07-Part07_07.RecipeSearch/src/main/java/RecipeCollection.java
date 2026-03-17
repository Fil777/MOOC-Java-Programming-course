
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Fil
 */
public class RecipeCollection {

    private ArrayList<Recipe> recipes;

    public RecipeCollection() {
        recipes = new ArrayList<>();
    }

    public void loadRecipes(String fileName) {
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                String recipeName = reader.nextLine();
                Integer timeToCook = Integer.valueOf(reader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    } else {
                        ingredients.add(ingredient);
                    }
                }
                recipes.add(new Recipe(recipeName, timeToCook, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printOne(Recipe recipe) {
        System.out.println(recipe.toString());
    }

    public void printList() {
        for (Recipe recipe : recipes) {
            printOne(recipe);
        }
    }

    public void printList(String searchString) {
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(searchString)) {
                printOne(recipe);
            }
        }
    }

    public void printList(Integer searchTime) {
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= searchTime) {
                printOne(recipe);
            }
        }
    }

    public void printList(String dump, String searchString) {
        for (Recipe recipe : recipes) {
            if (recipe.hasIngredient(searchString)) {
                printOne(recipe);
            }
        }
    }

}
