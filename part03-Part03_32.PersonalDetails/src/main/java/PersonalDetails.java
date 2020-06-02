
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = {};
        int longest = 0;
        String finalName = "";
        int years = 0;
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            values = input.split(",");

            years += Integer.valueOf(values[1]); 
            counter++;
            if (values[0].length() > longest) {
                longest = values[0].length();
                finalName = values[0];
            }
        }
        System.out.println("Longest name: " + finalName);
        System.out.println("Average of the birth years: " + (years/(counter*1.0)));
    }
}
