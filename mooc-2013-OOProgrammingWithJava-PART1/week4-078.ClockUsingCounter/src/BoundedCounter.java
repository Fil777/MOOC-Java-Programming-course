/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        value ++;
        if (value > upperLimit) value = 0;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value){
        if (value >= 0 && value <= upperLimit) this.value = value;
    }
    
    public String toString() {
        if (value < 10) return "0" + value;
        return "" + value;
    }
}