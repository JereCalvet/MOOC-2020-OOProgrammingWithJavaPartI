
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numA = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numB = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int numC = Integer.valueOf(scanner.nextLine());
        double avg = (numA + numB + numC) / 3.0;
        System.out.println("The average is " + avg);
    }
}
