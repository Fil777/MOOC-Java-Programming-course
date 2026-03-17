
import java.util.Comparator;


/**
 *
 * @author Fil
 */
public class BySuitInValueOrder implements Comparator<Card> {
    
    @Override
    public int compare(Card c1, Card c2) {
        return (100 * c1.getSuit().ordinal() + c1.getValue()) 
                - (100 * c2.getSuit().ordinal() + c2.getValue());
    }
}