
import java.util.ArrayList;
import java.util.Comparator;

public class Room {
    private ArrayList<Person> personCollection;

    public Room() {
        this.personCollection = new ArrayList<>();
    }
    
    public void add(Person person) {
        personCollection.add(person);
    }
    
    public boolean isEmpty() {
        return personCollection.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return personCollection;
    }
    
    public Person shortest() {
        return personCollection.stream().min(Comparator.comparing(Person::getHeight)).orElse(null);
    }
    
    public Person take() {
        if (shortest() != null) {
            Person shortest = shortest();
            personCollection.remove(shortest);
            return shortest;
        }
        return null;
    }
}
