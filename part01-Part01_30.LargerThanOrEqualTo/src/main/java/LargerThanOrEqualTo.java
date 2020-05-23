
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int numA = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int numB = Integer.valueOf(scan.nextLine());
        if (numA > numB) {
            System.out.println("Greater number is: " + numA);
        } else if (numA < numB) {    
            System.out.println("Greater number is: " + numB);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
