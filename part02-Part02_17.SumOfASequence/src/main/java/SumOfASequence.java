
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNum = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        int sum = 0;
        while (counter <= lastNum) {
            sum += counter;
            counter++;
        }
        System.out.println("The sum is " + sum);
    }
}
