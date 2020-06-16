
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        int size = elements.size();
        if (elements.isEmpty()) {
            String result = "The collection " + name + " is empty.";
            return result;
        } else if (size == 1) {
            String result = "The collection " + name + " has " + size + " element:" + "\n";
            result += elements.get(0);
            return result;
        } else {
            String result = "The collection " + name + " has " + size + " elements:" + "\n";
            for (String element : elements) {
            result += element + "\n";
            }
            return result;
        }
    }
}
