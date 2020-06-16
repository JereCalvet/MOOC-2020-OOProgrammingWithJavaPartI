
import java.math.BigDecimal;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(euros + addition.euros(), cents + addition.cents());
    }

    public boolean lessThan(Money compared) {
        if (euros > compared.euros()) {
            return false;
        }

        if (euros == compared.euros() && cents > compared.cents()) {
            return false;
        }

        return true;
    }

    public Money minus(Money decreaser) {
        int euroDifference = euros - decreaser.euros();
        int centDifference = cents - decreaser.cents();

        if (centDifference < 0) {
            centDifference += 100;
            euroDifference--;
        }

        if (euroDifference < 0) {
            return new Money(0, 0);
        }

        return new Money(euroDifference, centDifference);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
