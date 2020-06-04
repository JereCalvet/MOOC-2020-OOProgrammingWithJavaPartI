
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        PaymentCard paulCard = new PaymentCard(20.0);
        PaymentCard mattCard = new PaymentCard(30.0);
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        paulCard.addMoney(20.0);
        mattCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50.0);
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
    }
}
