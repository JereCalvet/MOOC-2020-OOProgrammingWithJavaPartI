
import java.util.Scanner;

public class AgeOfTheOldest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = {};
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            values = input.split(",");
            
            if (Integer.valueOf(values[1]) > oldest) {
                oldest = Integer.valueOf(values[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
