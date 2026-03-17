
import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item != null) {
            if (item.getWeight() + this.getWeight() <= this.maxWeight) {
                items.add(item);
            }
        }
    }

    public int getWeight() {
        int sum = 0;
        for (Item item : items){
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public boolean isInBox(Item item) {
        if (item == null) {
            return false;
        }
        if (items.isEmpty()) {
            return false;
        }
        return items.contains(item);
    }
}
