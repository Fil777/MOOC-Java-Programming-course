/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class OneItemBox extends Box {
    private Item oneItem;
    
    public OneItemBox(){
        oneItem = null;
    }
    
    @Override
    public void add(Item item){
        if (oneItem == null) {
            oneItem = item;
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        if (oneItem == null) {
            return false;
        }
        return oneItem.equals(item);
    }
    
}
