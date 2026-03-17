
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private final Map<String, Integer> prices;
    private final Map<String, Integer> stocks;

    public Warehouse() {
        prices = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        if (price < 0 || stock < 0) {
            return;
        }
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        //if (stocks.isEmpty()) return -99;
        return prices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        //if (stocks.isEmpty()) return 0;
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stocks.isEmpty()) return false;
        int currentStock = stocks.getOrDefault(product, 0);
        if (currentStock == 0) return false;
        currentStock --;
        stocks.put(product, currentStock);
        return true;
    }
    
    public Set<String> products(){
        return stocks.keySet();
    }
    
    public void clear() {
        stocks.clear();
    }
}
