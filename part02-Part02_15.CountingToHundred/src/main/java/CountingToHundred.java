
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.valueOf(scanner.nextLine());
        while (amount <= 100) {
            System.out.println(amount);
            amount++;
        }
    }
}
