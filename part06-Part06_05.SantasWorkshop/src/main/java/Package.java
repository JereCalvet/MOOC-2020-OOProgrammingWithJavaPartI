
import java.util.ArrayList;
import java.util.List;

public class Package {
    
    private List<Gift> giftsCollection;

    public Package() {
        this.giftsCollection = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        giftsCollection.add(gift);
    }

    public int totalWeight() {
       return giftsCollection.stream().mapToInt(gift -> gift.getWeight()).sum();
    }
}
