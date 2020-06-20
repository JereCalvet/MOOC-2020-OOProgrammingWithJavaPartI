
import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class TextUI {

    private final Scanner scan;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            switch (command) {
                case "add":
                    System.out.print("Word: ");
                    String word = scan.nextLine();
                    System.out.print("Translation: ");
                    String traslation = scan.nextLine();
                    dictionary.add(word, traslation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String wordToSearch = scan.nextLine();
                    String result = dictionary.translate(wordToSearch);
                    if (result == null) {
                        System.out.println("Word " + wordToSearch + " was not found");
                    } else {
                        System.out.println("Translation: " + result);
                    }
                    break;
                case "end":
                    break;
                default:
                    System.out.println("Unkown command");
            }

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
        }
    }
}
