/**
 *
 * @author Jere
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors; 

public class Games {
    private List<Match> listOfGames;

    public Games() {
        this.listOfGames = new ArrayList<>();
    }
    
    public void addMatch(Match match) {
        listOfGames.add(match);
    }
     
    public int getAmountOfGames (String teamName) {
        Predicate<Match> localGamesPlayed = team -> team.getHomeTeam().contains(teamName);
        Predicate<Match> visitGamesPlayed = team -> team.getVisitingTeam().contains(teamName);
        return Math.toIntExact(listOfGames.stream().filter(localGamesPlayed.or(visitGamesPlayed)).count());
    }
    
    public int getAmountOfWonGames (String teamName) {
        return Math.toIntExact(listOfGames.stream().filter(match -> match.getWinner().equals(teamName)).count());
    }
    
    public int getAmountOfLostGames (String teamName) {
        return Math.toIntExact(listOfGames.stream().filter(match -> match.getLoser().equals(teamName)).count());
    }
}
