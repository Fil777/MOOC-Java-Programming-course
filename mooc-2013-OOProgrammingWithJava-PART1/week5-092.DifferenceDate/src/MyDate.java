import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public long differenceInDays(MyDate comparedDate){
        long daysBetween = ChronoUnit.DAYS.between(
                LocalDate.of(comparedDate.year, comparedDate.month, comparedDate.day),
                LocalDate.of(this.year, this.month, this.day));     
        return Math.abs(daysBetween);
    }
    
    public int differenceInYears(MyDate comparedDate){
        long diff;
        diff = differenceInDays(comparedDate);
        if (diff == 0 ) return 0;
        if (diff % 365 == 0) return (int) (diff / 365) - 1;
        return (int) (diff / 365);
    }
}
