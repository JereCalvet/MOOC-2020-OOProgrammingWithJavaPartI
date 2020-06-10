
/**
 *
 * @author Jere
 */
public class Book {
    private final String author;
    private final String name;
    private final int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}
