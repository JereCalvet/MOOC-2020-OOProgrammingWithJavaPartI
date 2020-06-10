/**
 *
 * @author Jere
 */
public class Match {
    private final String homeTeam;
    private final String visitingTeam;
    private final int homeTeamPoints;
    private final int visitingTeamPoints;
    private final String winner;
    private final String loser;

    public Match(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
        this.winner = calculateWinningTeam();
        this.loser = calculateLosingTeam();
    }

    private String calculateWinningTeam() {
        String check;
        return check = homeTeamPoints > visitingTeamPoints ? homeTeam : visitingTeam; 
    }
    private String calculateLosingTeam() {
        String check;
        return check = homeTeamPoints > visitingTeamPoints ? visitingTeam : homeTeam; 
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getVisitingTeamPoints() {
        return visitingTeamPoints;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }    

    public String getLoser() {
        return loser;
    }

    public String getWinner() {
        return winner;
    }

    @Override
    public String toString() {
        return homeTeam + " vs " + visitingTeam;
    }
}
