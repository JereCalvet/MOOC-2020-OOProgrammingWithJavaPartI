
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> listOfItems = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String code = scanner.nextLine();
           
            if (code.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String item = scanner.nextLine();

            if (item.isEmpty()) {
                break;
            }

            Item temp = new Item(code, item);

            if (!listOfItems.contains(temp)) {
                listOfItems.add(temp);
            }

        }
        System.out.println("==Items==");
        listOfItems.forEach(item -> System.out.println(item));
    }
}
