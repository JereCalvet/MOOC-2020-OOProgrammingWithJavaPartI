
/**
 *
 * @author Jere
 */
public class Song {

    private final String name;
    private final int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String name() {
        return name;
    }

    public int length() {
        return length;
    }
}
