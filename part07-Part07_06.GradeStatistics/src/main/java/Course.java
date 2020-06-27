
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Course {

    private List<Points> coursePoints;

    public Course() {
        this.coursePoints = new ArrayList<>();
    }

    public void addPoints(Points score) {
        this.coursePoints.add(score);
    }

    private void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private double pointsAvg() {
        return coursePoints.stream().mapToDouble(points -> points.getPoints()).average().getAsDouble();
    }

    private double pointsAvgPassing() {
        return coursePoints.stream().filter(points -> points.getPoints() >= 50).mapToDouble(points -> points.getPoints()).average().getAsDouble();
    }

    private int amountOfParticipants() {
        return coursePoints.size();
    }

    private double amountOfPassingParticipants() {
        return coursePoints.stream().filter(participant -> participant.getPoints() >= 50).count();
    }

    private double participantsPassPercentage() {
        return 100 * amountOfPassingParticipants() / amountOfParticipants();
    }

    private int catAmount(char cattegory) {
        return (int) coursePoints.stream().filter(points -> points.getCattegory() == cattegory).count();
    }

    public void printCalculation() {
        System.out.print("Point average (all): ");
        System.out.println(pointsAvg());
        System.out.print("Points average (passing): ");
        System.out.println(pointsAvgPassing());
        System.out.print("Pass percentage: ");
        System.out.println(participantsPassPercentage());
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(catAmount('5'));
        System.out.print("4: ");
        printStars(catAmount('4'));
        System.out.print("3: ");
        printStars(catAmount('3'));
        System.out.print("2: ");
        printStars(catAmount('2'));
        System.out.print("1: ");
        printStars(catAmount('1'));
        System.out.print("0: ");
        printStars(catAmount('0'));
    }
}
