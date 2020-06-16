
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        if (day < 30) {
            day++;
        } else {
            if (month < 12) {
                month++;
                day = 1;
            } else {
                month = 1;
                day = 1;
                year++;
            }
        }       
    }
    
    public void advance(int howManyDays) {
        while (howManyDays-- > 0) {
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate result = new SimpleDate(day, month, year);
        result.advance(days);
        return result;
    }
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
