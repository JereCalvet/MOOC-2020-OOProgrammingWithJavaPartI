
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this.getClass() != compared.getClass()) {
            return false;
        }
        
        if (compared == null || this == null) {
            return false;
        }
        
        Person otherPerson = (Person) compared;
        
        if (!name.equals(otherPerson.name)) {
            return false;
        }
        
        if (height != otherPerson.height) {
            return false;
        }
        
        if (weight != otherPerson.weight) {
            return false;
        }
        
        if (!birthday.equals(otherPerson.birthday) ) {
            return false;
        }
        
        return true;
    }
    
}
