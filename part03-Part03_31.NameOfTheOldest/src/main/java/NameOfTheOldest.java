
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = {};
        int oldest = 0;
        String nameOfTheOldest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            values = input.split(",");

            if (Integer.valueOf(values[1]) > oldest) {
                oldest = Integer.valueOf(values[1]);
                nameOfTheOldest = values[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);

    }
}
