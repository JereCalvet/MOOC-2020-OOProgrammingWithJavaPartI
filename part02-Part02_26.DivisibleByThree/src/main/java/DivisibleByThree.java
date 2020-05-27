
import java.util.Scanner;

public class DivisibleByThree {

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (;beginning <= end; beginning++) {
            if (beginning % 3 == 0) {
                System.out.println(beginning);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }

}
