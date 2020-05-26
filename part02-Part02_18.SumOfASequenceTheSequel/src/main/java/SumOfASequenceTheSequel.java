
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.valueOf(scanner.nextLine());
        int lastNum = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        while (firstNum <= lastNum) {
            sum += firstNum;
            firstNum++;
        }
        System.out.println("The sum is " + sum);
    }
}
