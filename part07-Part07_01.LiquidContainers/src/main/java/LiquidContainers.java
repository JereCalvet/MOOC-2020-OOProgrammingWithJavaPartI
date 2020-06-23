
import java.util.Scanner;

public class LiquidContainers {

    //ty for forcing me to write bad code 
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainerLiquitAmount = 0;
        int secondContainerLiquitAmount = 0;

        while (true) {
            System.out.println("First: " + firstContainerLiquitAmount + "/100");
            System.out.println("Second: " + secondContainerLiquitAmount + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            switch (command) {
                case "add":
                    if (amount < 0) {
                        break;
                    }
                    firstContainerLiquitAmount = firstContainerLiquitAmount + amount > 100 ? 100 : firstContainerLiquitAmount + amount;
                    break;
                case "move":
                    if (amount < 0) {
                        break;
                    }
                    int finalAmountToMove = firstContainerLiquitAmount < amount ? firstContainerLiquitAmount : amount;
                    firstContainerLiquitAmount -= finalAmountToMove;
                    secondContainerLiquitAmount = secondContainerLiquitAmount + finalAmountToMove > 100 ? 100 : secondContainerLiquitAmount + finalAmountToMove;
                    break;
                case "remove":
                    if (amount < 0) {
                        break;
                    }
                    int finalAmountToRemove = secondContainerLiquitAmount < amount ? secondContainerLiquitAmount : amount;
                    secondContainerLiquitAmount -= finalAmountToRemove;
                    break;
            }
            System.out.println();
        }
    }

}
