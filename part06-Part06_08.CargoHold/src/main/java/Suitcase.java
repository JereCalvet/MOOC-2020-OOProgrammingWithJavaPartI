
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {

    private int maxWeight;
    private List<Item> itemsCollection;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.itemsCollection = new ArrayList<>();
    }

    public int getAmountOfItems() {
        return itemsCollection.size();
    }
    
    public void addItem(Item itemToAdd) {
        if (totalWeight() + itemToAdd.getWeight() <= maxWeight) {
            this.itemsCollection.add(itemToAdd);
        }
    }

    public void printItems() {
        itemsCollection.stream().forEach(System.out::println);
    }

    public int totalWeight() {
        return itemsCollection.stream().mapToInt(item -> item.getWeight()).sum();
    }

    public Item heaviestItem() {
        Item heaviest = itemsCollection.stream().max(Comparator.comparing(Item::getWeight)).orElse(null);
        return heaviest;
    }
    
    @Override
    public String toString() {
        int size = getAmountOfItems();
        switch (size) {
            case 0:
                return "no items (0 kg)";
            case 1:
                return size + " item (" + totalWeight() + " kg)";
            default:
                return size + " items (" + totalWeight() + " kg)";
        }
    }
}
