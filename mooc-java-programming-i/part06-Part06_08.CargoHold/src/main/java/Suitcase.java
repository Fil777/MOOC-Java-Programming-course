
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
public class Suitcase {

    private final int maxWeight;
    private final ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int heaviestItemIndex() {
        if (items.isEmpty()) {
            return -1;
        }
        int maxWeight = 0;
        int index = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getWeight() > maxWeight) {
                maxWeight = items.get(i).getWeight();
                index = i;
            }
        }
        return index;
    }

    public Item heaviestItem() {
        int index = heaviestItemIndex();
        if (index < 0) {
            return null;
        }
        return items.get(index);
        //return new Item(items.get(index).getName(), items.get(index).getWeight());
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else {
            return items.size() + " " + itemsWord(items.size())
                    + " (" + totalWeight() + " kg)";
        }
    }

    private String itemsWord(int n) {
        if (n == 1) {
            return "item";
        } else {
            return "items";
        }
    }
}
