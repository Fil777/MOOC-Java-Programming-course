/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
// solution from course
public class MoneyAlt {
 
    private final int euros;
    private final int cents;
 
    public MoneyAlt(int euros, int cents) {
 
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
 
    public Money plus(Money added) {
        int euroSum = euros + added.euros();
        int centSum = cents + added.cents();
 
        if (centSum > 99) {
            centSum -= 100;
            euroSum++;
        }
 
        return new Money(euroSum, centSum);
    }
 
    public boolean less(Money compared) {
        return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
    }
 
    public Money minus(Money decremented) {
        int euroDifference = euros - decremented.euros();
        int centDifference = cents - decremented.cents();
 
        if (centDifference < 0) {
            centDifference += 100;
            euroDifference--;
        }
 
        if (euroDifference < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euroDifference, centDifference);
    }
}
