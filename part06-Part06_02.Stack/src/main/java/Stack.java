
import java.util.ArrayList;


public class Stack {

    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public void add(String value) {
        items.add(value);
    }

    public ArrayList<String> values() {
        return items;
    }
    
    public String take() {
        String result = items.get(items.size() - 1);
        items.remove(items.get(items.size() - 1));        
        return result;
    }
}
