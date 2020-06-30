import java.util.Scanner;

/**
 *
 * @author Jere
 */
public class UserInterface {

    public static String stringInput(Scanner ok) {
        return ok.nextLine();
    }

    public static int intInput(Scanner ok) {
        return Integer.parseInt(ok.nextLine());
    }

    public void gameStart() {
        Scanner sc = new Scanner(System.in);
        Statics birdlist = new Statics();
        Bird a = new Bird("chaja", "chajapolus");
        Bird b = new Bird("mufasa", "mufasapolus");
        birdlist.add(a);
        birdlist.add(b);

        /*
        este while se podia mejorar implmentando metodos para cada comando
        */
        while (true) {
            System.out.println("?");
            String input = stringInput(sc);

            if (StringUtils.EqualsIgnoreCase("Add", input)) {
                System.out.print("Name: ");
                String name = stringInput(sc);
                System.out.print("Latin Name: ");
                String lName = stringInput(sc);
                birdlist.add(new Bird(name, lName));
            } else if (StringUtils.EqualsIgnoreCase("Observation", input)) {
                System.out.print("What was observed:? ");
                Bird aux = birdlist.search(stringInput(sc));
                if (aux != null) {
                    birdlist.observation(aux);
                }
            } else if (StringUtils.EqualsIgnoreCase("All", input)) {
                birdlist.printList();
            } else if (StringUtils.EqualsIgnoreCase("One", input)) {
                System.out.print("What? ");
                Bird aux = birdlist.search(stringInput(sc));
                if (aux != null) {
                    System.out.println(aux);
                }
            } else if (StringUtils.EqualsIgnoreCase("Quit", input)) {
                break;
            }
        }
    }
}