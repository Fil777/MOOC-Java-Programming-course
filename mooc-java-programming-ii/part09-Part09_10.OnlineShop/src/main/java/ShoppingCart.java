
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (price < 0) {
            price = 0;
        }
        if (cart.containsKey(product)) {
            cart.get(product).increaseQuantity();
        } else {
            cart.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (Item item : cart.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item item : cart.values()) {
            System.out.println(item);
        }
    }
}
