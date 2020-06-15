
import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getPrincePerSquare() {
        return princePerSquare;
    }

    public int getSquares() {
        return squares;
    }
    
    private int getSize() {
        return rooms * squares;
    }
    
    public int getPrice() {
        return squares * princePerSquare;
    }

    private BiPredicate<Apartment, Apartment> largerThanBi = (x, y) -> x.getSize() > y.getSize();
    
    public boolean largerThan(Apartment compared) {
        return largerThanBi.test(this, compared);
    }
   
    private BiFunction<Apartment, Apartment, Integer> priceDiff = (x, y) -> Math.abs(x.getPrice() - y.getPrice());
    
    public int priceDifference(Apartment compared) {
        return priceDiff.apply(this, compared);
    }
    
    private BiPredicate<Apartment, Apartment> moreExpensiveThanBi = (x, y) -> x.getPrice() > y.getPrice();
    
    public boolean moreExpensiveThan(Apartment compared) {
        return moreExpensiveThanBi.test(this, compared);
    }
    
}
