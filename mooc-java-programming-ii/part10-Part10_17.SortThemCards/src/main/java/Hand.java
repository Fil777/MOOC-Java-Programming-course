
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Fil
 */
public class Hand implements Comparable <Hand> {
    private List<Card> hand;
    
    public Hand(){
        hand = new ArrayList<>();
    }
    
    public void add(Card card){
        if (card != null){
            hand.add(card);
        }
    }
    
    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(hand, Comparator.comparing(Card::getValue).thenComparing(Card::getSuit));
    }
    
    public int getRank(){
        return hand.stream().mapToInt(card -> card.getValue()).sum();
    }
    
    @Override
    public int compareTo(Hand other){
        return this.getRank() - other.getRank();
    }
    
    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
}
