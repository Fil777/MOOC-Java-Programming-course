
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        System.out.println("any price: " + warehouse.price("any"));
        System.out.println("any stock: " + warehouse.stock("any"));

        System.out.println();

        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 1);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));

        System.out.println();

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println();

        System.out.println("products:");

        for (String product : warehouse.products()) {
            System.out.println(product);
        }

        System.out.println();

        Item item = new Item("tobacco", 4, 2);
        System.out.println("an item that contains 4 tobaccos has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);

        System.out.println();

        ShoppingCart cartX = new ShoppingCart();
        cartX.add("milk", 3);
        cartX.add("buttermilk", 2);
        cartX.add("cheese", 5);
        System.out.println("cart price: " + cartX.price());
        cartX.add("computer", 899);
        System.out.println("cart price: " + cartX.price());

        System.out.println();

        cartX.print();

        System.out.println();

        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("buttermilk", 2);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        cart.add("milk", 3);
        cart.print();
        System.out.println("cart price: " + cart.price() + "\n");

        System.out.println();

        //Warehouse warehouse = new Warehouse();
        warehouse.clear();
        warehouse.addProduct("coffee", 5, 1);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
