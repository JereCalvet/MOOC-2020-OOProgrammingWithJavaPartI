/**
 *
 * @author Jere
 */
public class Book {
    private final String title;
    private final int pages;
    private final int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + year;
    } 
}
