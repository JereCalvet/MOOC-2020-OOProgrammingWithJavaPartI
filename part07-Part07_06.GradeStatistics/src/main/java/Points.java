
/**
 *
 * @author Jere
 */
public class Points {

    private final int points;
    private char cattegory;

    public Points(int points) {
        this.points = points;
        calculateCat();
    }

    public int getPoints() {
        return points;
    }

    public char getCattegory() {
        return cattegory;
    }

    public void calculateCat() {
        if (this.points < 50) {
            this.cattegory = '0';
        } else if (this.points < 60) {
            this.cattegory = '1';
        } else if (this.points < 70) {
            this.cattegory = '2';
        } else if (this.points < 80) {
            this.cattegory = '3';
        } else if (this.points < 90) {
            this.cattegory = '4';
        } else {
            this.cattegory = '5';
        }
    }
}
