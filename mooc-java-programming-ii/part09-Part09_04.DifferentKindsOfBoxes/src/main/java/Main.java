
public class Main {

    public static void main(String[] args) {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));

        System.out.println();

        OneItemBox box1 = new OneItemBox();
        box1.add(new Item("Saludo", 5));
        box1.add(new Item("Pirkka", 5));

        System.out.println(box1.isInBox(new Item("Saludo")));
        System.out.println(box1.isInBox(new Item("Pirkka")));

        System.out.println();

        MisplacingBox box2 = new MisplacingBox();
        box2.add(new Item("Saludo", 5));
        box2.add(new Item("Pirkka", 5));

        System.out.println(box2.isInBox(new Item("Saludo")));
        System.out.println(box2.isInBox(new Item("Pirkka")));
    }
}
