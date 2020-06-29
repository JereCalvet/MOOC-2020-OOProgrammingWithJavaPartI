
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jere
 */

public class RecipesBook {
    private final List<Recipe> recipes;

    public RecipesBook() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipeToAdd) {
        recipes.add(recipeToAdd);
    }
    
    public void printAllRecipes() {
        recipes.stream().forEach(System.out::println);
    }
    
    public void findRecipeByName(String recipeName) {
       List<Recipe> temp = recipes.stream().filter(recipe -> recipe.getName().contains(recipeName)).collect(Collectors.toList());
       temp.stream().forEach(System.out::println);
    }
    
    public void findRecipeByCookingTime(int cookingTime) {
       List<Recipe> temp = recipes.stream().filter(recipe -> recipe.getCookTime() <= cookingTime).collect(Collectors.toList());
       temp.stream().forEach(System.out::println);
    }
    
    public void findRecipeByIngredients(String ingredients) {
       List<Recipe> temp = recipes.stream().filter(recipe -> recipe.getIngredients().contains(ingredients)).collect(Collectors.toList());
       temp.stream().forEach(System.out::println);
    }
}
