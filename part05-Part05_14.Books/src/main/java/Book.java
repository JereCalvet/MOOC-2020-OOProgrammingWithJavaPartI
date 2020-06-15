
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (this.getClass() != compared.getClass()) {
            return false;
        }
        
        Book otherBook = (Book) compared;
        
        if (name.equals(otherBook.getName()) && publicationYear == otherBook.getPublicationYear()) {
            return true;
        }
        
        return false;    
    }

}
