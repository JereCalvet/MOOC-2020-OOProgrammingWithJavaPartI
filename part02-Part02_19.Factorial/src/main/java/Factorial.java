
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        int sum = 1;
        while (counter <= num) {
            sum *= counter;
            counter++;
        }
        if (num == 0) {
            System.out.println("Factorial: 1");
        } else {
            System.out.println("Factorial: " + sum);
        }
    }
}
