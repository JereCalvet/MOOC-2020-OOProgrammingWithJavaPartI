//commit name update
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.0);
        Account myAccount = new Account("My account", 0);
        matthewsAccount.withdrawal(100.0);
        myAccount.deposit(100);
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
