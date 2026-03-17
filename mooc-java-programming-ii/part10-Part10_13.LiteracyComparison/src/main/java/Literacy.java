
/**
 *
 * @author Fil
 */
public class Literacy implements Comparable<Literacy> {

    private String theme;
    private String group;
    private String gender;
    private String country;
    private int year;
    private double percent;

    public Literacy(
            String theme,
            String group,
            String gender,
            String country,
            int year,
            double percent
    ) {
        this.theme = theme;
        this.group = group;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + percent;
    }

    @Override
    public int compareTo(Literacy other) {
        return (int) ((this.percent - other.percent) * 1000000);
    }
}
