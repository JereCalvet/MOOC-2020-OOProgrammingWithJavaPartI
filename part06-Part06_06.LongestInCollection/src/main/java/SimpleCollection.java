
import java.util.ArrayList;
import java.util.Comparator;

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

    public String longest() {
        return elements.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }
}
