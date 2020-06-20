
import java.util.Scanner;


/**
 *
 * @author Jere
 */
public class UserInterface {
    private JokeManager manager;
    private Scanner scan;

    public UserInterface(JokeManager manager, Scanner scan) {
        this.manager = manager;
        this.scan = scan;
    }
    
    public void start() {
        while (true) {
            printInterface();
            String command = scan.nextLine();
            if (command.equals("x") || command.equals("X")) {
                break;
            }
            
            commandHandler(command);
        }
    }
    
    private void printInterface() {
        System.out.println("Commands:\n" +
                           "1 - add a joke\n" +
                           "2 - draw a joke\n" +
                           "3 - list jokes\n" +
                           "X - stop");
    }

    private void commandHandler(String command) {
        switch (command) {
            case "1":
                System.out.println("Write the joke to be added:");
                String joke = scan.nextLine();
                manager.addJoke(joke);
                break;
            case "2":
                System.out.println(manager.drawJoke());
                break;
            case "3":
                manager.printJokes();
        }
    }
    
}
