
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class Library {
    private List<Book> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public List<Book> getCollection() {
        return collection;
    }
    
    public void addBook(Book book) {
        this.collection.add(book);
    }
}
