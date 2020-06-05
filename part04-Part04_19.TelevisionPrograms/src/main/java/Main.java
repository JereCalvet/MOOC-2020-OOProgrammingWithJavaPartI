import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration  = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(name, duration));
        }
        
        System.out.println("");
        System.out.print("Program's maximun duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        programs.stream().filter( program -> program.getDuration() <= max).forEach(program -> {System.out.println(program.getName() + ", " + program.getDuration() + " minutes"); });
    }
}
