/**
 *
 * @author Jere
 */
public class Fitbyte {
    private final int age;
    private final int restingHartRate;

    public Fitbyte(int age, int restingHartRate) {
        this.age = age;
        this.restingHartRate = restingHartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximun) {
        return ((206.3 - (0.711 * age)) - restingHartRate) * (percentageOfMaximun) + restingHartRate;
    }
           
}
