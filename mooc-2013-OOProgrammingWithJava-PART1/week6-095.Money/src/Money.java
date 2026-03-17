
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public boolean less(Money compared){
        if (this.euros < compared.euros) return true;
        if (this.euros > compared.euros) return false;
        if (this.cents < compared.cents) return true;
        return false;
    }
    
    public Money minus(Money decremented){
        long res = ((long)(this.euros * 100) + this.cents) 
                - ((long)(decremented.euros * 100) + decremented.cents)  ;
        if (res < 0) res = 0;
        Money money = new Money((int)res/100, (int) res%100);
        return money;
    }

    public Money plus(Money added){
        long res = ((long)(this.euros * 100) + this.cents) 
                + ((long)(added.euros * 100) + added.cents)  ;
        Money money = new Money((int)res/100, (int) res%100);
        return money;
    }
    
}
