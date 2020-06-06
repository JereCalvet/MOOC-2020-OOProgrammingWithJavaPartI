import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        Library library = new Library();
        
        while (true) {
            System.out.print("Title: ");
            String names = reader.nextLine();
            if (names.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(reader.nextLine());
            System.out.print("Title: ");
            int year = Integer.valueOf(reader.nextLine());
            library.addBook(new Book(names, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String infoRequested = reader.nextLine();
        System.out.println();
               
        if (infoRequested.equals("everything")) {
            library.getCollection().stream().map(x -> x.toString()).forEach(System.out::println);
        } else {
            library.getCollection().stream().map(x -> x.getTitle()).forEach(System.out::println);
        }
    }
}
