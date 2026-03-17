
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public int priceTotal(){
        return pricePerSquareMeter * squareMeters;
    }
    
    public int priceGap(Apartment otherApartment){
        return this.priceTotal() - otherApartment.priceTotal();
    }
    
    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.priceGap(otherApartment));
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.priceGap(otherApartment) > 0;
    }
}
