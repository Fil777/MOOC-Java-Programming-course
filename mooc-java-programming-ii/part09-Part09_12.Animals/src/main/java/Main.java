
public class Main {

    public static void main(String[] args) {

        NoiseCapable dog = new Dog("Godzilla");
        dog.makeNoise();

        NoiseCapable cat = new Cat("Fox");
        cat.makeNoise();
        
        Cat c = (Cat) cat;
        c.purr();

    }

}
