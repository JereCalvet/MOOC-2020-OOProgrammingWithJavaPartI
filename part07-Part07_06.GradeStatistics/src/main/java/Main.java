import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course course = new Course();
        
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int score = Integer.parseInt(sc.nextLine());
            if (score == -1) {
                break;
            }
           if (score > -1 && score < 101){
               course.addPoints(new Points(score)); 
           } 
        }
        System.out.println();
        course.printCalculation();
    }
}