
/**
 *
 * @author Jere
 */
public class Timer {

    private ClockHand min;
    private ClockHand sec;

    public Timer() {
        this.min = new ClockHand(60);
        this.sec = new ClockHand(100);
    }

    public void advance() {
        sec.advance();

        if (this.sec.value() == 0) {
            this.min.advance();
        }
    }

    @Override
    public String toString() {
        return min + ":" + sec;
    }
}
