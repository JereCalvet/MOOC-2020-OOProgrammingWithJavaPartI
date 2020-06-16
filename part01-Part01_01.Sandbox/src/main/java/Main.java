
import java.util.Scanner;

class CoffeeMachine {

    private int water;
    private int milk;
    private int gramsCoffee;

    CoffeeMachine(int water, int milk, int gramsCoffee) {
        this.water = water;
        this.milk = milk;
        this.gramsCoffee = gramsCoffee;
    }

    private int amountOfCupMachineCanMake() {
        int cupsWater = (int) water / 200;
        int cupsMilk = (int) milk / 50;
        int cupsCoffee = (int) gramsCoffee / 15;
        return Math.min(cupsMilk, Math.min(cupsMilk, cupsCoffee));
    }

    public void coffeeRequest(int amountOfCupsNeeded) {
        int coffeeCups = amountOfCupMachineCanMake() - amountOfCupsNeeded;

        if (coffeeCups == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeCups > 0) {
            System.out.println("Yes, I can make that amount of coffee (and even " + coffeeCups + " more than that)");
        } else {
            System.out.println("No, I can make only " + coffeeCups + " cup(s) of coffee");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int amountOfWater = Integer.valueOf(scan.nextLine());
        System.out.println("Write how many ml of milk the coffee machine has:");
        int amountOfMilk = Integer.valueOf(scan.nextLine());
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int amountOfCoffee = Integer.valueOf(scan.nextLine());
        System.out.println("Write how many cups of coffee you will need:");
        int amountOfCupsNeeded = Integer.valueOf(scan.nextLine());

        CoffeeMachine machine = new CoffeeMachine(amountOfWater, amountOfMilk, amountOfCoffee);
        machine.coffeeRequest(amountOfCupsNeeded);

        /*
        System.out.println("");
        System.out.println("Write how many cups of coffee you will need:");
        int amountOfCoffee = Integer.valueOf(scan.nextLine());
        System.out.println("For " + amountOfCoffee + " cups of coffee you will need:");
        System.out.println((200*amountOfCoffee) + "ml of water");
        System.out.println((50*amountOfCoffee) + " ml of milk");
        System.out.println((15*amountOfCoffee)+ " g of coffee beans");
        
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
         */
    }
}
