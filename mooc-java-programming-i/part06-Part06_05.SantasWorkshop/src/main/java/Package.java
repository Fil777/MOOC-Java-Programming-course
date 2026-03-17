
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Package {
    private final ArrayList<Gift> gifts;
    
    public Package(){
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int sum = 0;
        for (Gift gift : gifts){
            sum += gift.getWeight();
        }
        return sum;
    }
}
