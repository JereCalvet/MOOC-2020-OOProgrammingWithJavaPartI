
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }
    
    public double average(){
        if (sum == 0 || count == 0) {
           return 0; 
        }
        return sum / (count * 1.0);
    }
}
