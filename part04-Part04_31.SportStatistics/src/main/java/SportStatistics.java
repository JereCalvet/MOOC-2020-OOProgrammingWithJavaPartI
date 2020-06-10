
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Games games = new Games();
        System.out.println("File: ");
        String input = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try {
            scan = new Scanner(Paths.get(input));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] lines = line.split(",");
                games.addMatch(new Match(lines[0], lines[1], Integer.valueOf(lines[2]), Integer.valueOf(lines[3])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + games.getAmountOfGames(team));
        System.out.println("Wins: " + games.getAmountOfWonGames(team));
        System.out.println("Losses: " + games.getAmountOfLostGames(team));
    }
}
