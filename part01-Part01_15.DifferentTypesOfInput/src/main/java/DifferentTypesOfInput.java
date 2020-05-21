
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        Double doubNum = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean flag = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + doubNum);
        System.out.println("You gave the boolean " + flag);

    }
}
