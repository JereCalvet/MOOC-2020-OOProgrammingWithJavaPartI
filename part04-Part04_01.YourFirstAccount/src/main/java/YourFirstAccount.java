
public class YourFirstAccount {

    public static void main(String[] args) {
        Account myAcc = new Account("me", 100.0);
        myAcc.deposit(20.0);
        System.out.println(myAcc);
    }
}
