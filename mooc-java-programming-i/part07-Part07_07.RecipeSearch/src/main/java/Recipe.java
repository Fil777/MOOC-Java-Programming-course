import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class Recipe {
    private String name;
    private Integer cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, Integer cookingTime, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return name;
    }
    
    public Integer getCookingTime(){
        return cookingTime;
    }
    
    public boolean hasIngredient(String text){
        for (String ingredient : ingredients){
            if (text.equals(ingredient)){
                return true;
            }
        }
        return false;
    }
    
    
    
    @Override
    public String toString(){
        return name + ", cooking time: " + cookingTime;
    }
    
}
