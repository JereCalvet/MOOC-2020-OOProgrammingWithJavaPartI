
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:"); 
        String textA = scan.nextLine();
        System.out.println("Enter the second string:"); 
        String textB = scan.nextLine();
        if (textA.equals(textB)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
