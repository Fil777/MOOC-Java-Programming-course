
import java.util.Objects;

public class LicensePlate {
    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public boolean equals(Object object){
        if (this == object) {
            return true;
        }
        if (!(object instanceof LicensePlate)) {
            return false;
        }
        LicensePlate comparedObject = (LicensePlate) object;
        return this.liNumber.equals(comparedObject.liNumber)
                && this.country.equals(comparedObject.country);
    }

    @Override
    public int hashCode() {
        return (this.liNumber + this.country).hashCode();
    }

}
