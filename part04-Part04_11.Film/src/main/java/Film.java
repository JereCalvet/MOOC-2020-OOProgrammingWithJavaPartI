
/**
 *
 * @author Jere
 */
public class Film {
    
    private final String name;
    private final int ageRating;

    public Film(String name, int ageRating) {
        this.name = name;
        this.ageRating = ageRating;
    }

    public int ageRating() {
        return ageRating;
    }

    public String name() {
        return name;
    }
}
