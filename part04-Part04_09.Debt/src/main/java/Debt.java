
/**
 *
 * @author Jere
 */
public class Debt {

    private double balance;
    private final double interestRate;

    public Debt(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public void printBalance(){
        System.out.println(balance);
    }
    
    public void waitOneYear(){
        balance *= interestRate;
    }
}
