
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Recipe {
    
    private final String name;
    private final int cookTime;
    private List<String> ingredients;

    public Recipe(String name, int cookTime) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
    
    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookTime;
    }
    
    
}
