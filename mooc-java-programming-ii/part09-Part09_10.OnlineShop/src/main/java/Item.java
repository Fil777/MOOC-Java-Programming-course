/*
 * Fil's project 2026
 */

/**
 *
 * @author Fil
 */
public class Item {
    private String product;
    private int price;
    private int qty;
    
   public Item(String product, int qty, int price){
       this.product = product;
       this.price = Math.max(price, 0);
       this.qty = Math.max(qty, 0);
   }
   
   public String product(){
       return product;
   }
   
   public int price(){
       return price * qty;
   }
   
   public void increaseQuantity(){
       qty++;
   }
   
   @Override
   public String toString(){
       return product + ": " + qty;
   }
   
   
}
