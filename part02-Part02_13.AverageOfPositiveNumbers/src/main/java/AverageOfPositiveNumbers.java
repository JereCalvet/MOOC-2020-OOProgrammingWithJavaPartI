
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum += input;
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println(sum / (counter * 1.0));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
