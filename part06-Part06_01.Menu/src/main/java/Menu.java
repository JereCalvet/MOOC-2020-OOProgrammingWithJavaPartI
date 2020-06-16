
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    public void printMeals() {
        meals.stream().forEach(System.out::println);
    }

    public void clearMenu() {
        meals.clear();
    }
}
