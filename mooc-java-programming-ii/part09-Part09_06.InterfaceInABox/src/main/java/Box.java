
import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public int itemsInBox() {
        return items.size();
    }

    public boolean alreadyInBox(Packable item) {
        for (Packable boxItem : items) {
            if (item == boxItem) {
                return true;
            }
        }
        return false;
    }

    public void add(Packable item) {
        if (this == item) {
            return;
        }
        if (alreadyInBox(item)) {
            return;
        }
        if (item.weight() + this.weight() > this.capacity) {
            return;
        }
        items.add(item);
    }

    @Override
    public double weight() {
        double sumWeight = 0.0;
        for (Packable item : items) {
            sumWeight += item.weight();
        }
        return sumWeight;
    }

    @Override
    public String toString() {
        return "Box: " + itemsInBox() + " items, total weight " + weight() + " kg";
    }
}
