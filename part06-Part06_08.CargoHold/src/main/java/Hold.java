
import java.util.List;
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private List<Suitcase> suitcaseCollection;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseCollection = new ArrayList<>();
    }

     public int totalWeight() {
        return suitcaseCollection.stream().mapToInt(suitcase -> suitcase.totalWeight()).sum();
    }

    public void printItems() {
        suitcaseCollection.stream().forEach(suitcase -> suitcase.printItems());
    } 
    
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcaseCollection.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int size = suitcaseCollection.size();
        switch (size) {
            case 0:
                return "no suitcase (0 kg)";
            case 1:
                return size + " suitcase (" + totalWeight() + " kg)";
            default:
                return size + " suitcases (" + totalWeight() + " kg)";
        }
    }
}
