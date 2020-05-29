
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.print("Search for? ");
        int desiredValue = Integer.valueOf(scanner.nextLine());
        int amountRemoved = 0;
        while (true) {
            if (list.contains(desiredValue)) {
                int desiredIndex = list.indexOf(desiredValue);
                System.out.println(desiredValue + " is at index " + (desiredIndex + amountRemoved));
                list.remove(desiredIndex);
                amountRemoved++;
            } else {
                break;
            }
        }
        
        /*
            jajaj podia hacer un fori, ya estoy quemado por hoy
        
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == desiredValue) {
                    System.out.println(desiredValue + " is at index " + i);
                }
            }   
        */
    }
}
