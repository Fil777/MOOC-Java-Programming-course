
public class Main {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1983);
        Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) ); // false
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) ); // true

        Person jarmo = new Person("Jarmo", 15, 9, 1954);
        Person petteri = new Person("Petteri", 4, 4, 1978);

        System.out.println( jarmo.getName() + " is older than " +  petteri.getName() + ": "+ jarmo.olderThan(petteri) ); // true
        System.out.println( petteri.getName() + " is older than " +  jarmo.getName() + ": "+ petteri.olderThan(jarmo) ); // false
    }
}
