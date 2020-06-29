
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Jere
 */
public class UserInterface {

    private final Scanner reader;
    private String file;
    private RecipesBook book;

    public UserInterface() {
        this.book = new RecipesBook();
        this.reader = new Scanner(System.in);
    }

    public void run() {
        printMenu();
    }

    private void handleFileContent(Queue<String> fileContent) {
        while (fileContent.peek() != null) {
            String recipeName = fileContent.poll();
            int cookTime = Integer.parseInt(fileContent.poll());
            Recipe temp = new Recipe(recipeName, cookTime);

            while (fileContent.size() > 0 && !fileContent.peek().isEmpty()) {
                temp.addIngredient(fileContent.poll());
            }

            book.addRecipe(temp);
            fileContent.poll();
        }
    }

    private void readFile(String file) {
        try ( Scanner reader = new Scanner(Paths.get(file))) {
            Queue<String> lines = new LinkedList<>();
            while (reader.hasNextLine()) {
                lines.add(reader.nextLine());
            }
            handleFileContent(lines);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void handleCommand(String command) {
        switch (command) {
            case "list":
                System.out.println("Recipes:");
                book.printAllRecipes();
                break;
            case "find name":
                System.out.print("Searched word: ");
                String searchedRecipeByWord = reader.nextLine();
                System.out.println("Recipes:");
                book.findRecipeByName(searchedRecipeByWord);
                break;
            case "find cooking time":
                System.out.print("Max cooking time: ");
                int searchedRecipeByCookingTime = Integer.parseInt(reader.nextLine());
                System.out.println("Recipes:");
                book.findRecipeByCookingTime(searchedRecipeByCookingTime);
                break;
            case "find ingredient":
                System.out.print("Ingredient: ");
                String searchedRecipeByIngredient = reader.nextLine();
                System.out.println("Recipes:");
                book.findRecipeByIngredients(searchedRecipeByIngredient);
                break;
        }
    }

    private void printMenu() {
        System.out.print("File to read: ");
        file = reader.nextLine();
        readFile(file);

        while (true) {
            System.out.println();
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println();
            System.out.print("Enter the command: ");
            String command = reader.nextLine();
            if (command.equals("stop")) {
                break;
            }
            System.out.println();
            handleCommand(command);
        }
    }
}
