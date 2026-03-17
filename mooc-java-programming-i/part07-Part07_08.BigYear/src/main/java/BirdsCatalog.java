
import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class BirdsCatalog {

    private ArrayList<Bird> birds;

    public BirdsCatalog() {
        birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        if (contains(bird.getName())) {
            return;
        }
        birds.add(bird);
    }

    public void addBirdObservation(Bird bird) {
        bird.addObservation();
    }

    public boolean contains(String birdName) {
        return getBirdIndex(birdName) >= 0;
    }

    public int getBirdIndex(String birdName) {
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equalsIgnoreCase(birdName)) {
                return i;
            }
        }
        return -1;
    }

    public Bird getBird(String birdName) {
        int index = getBirdIndex(birdName);
        if (index < 0) {
            return null;
        }
        return birds.get(index);
    }
    
    public void printOne(Bird bird){
        System.out.println(bird.toString());
    }
    
    public void printAll(){
        for (Bird bird : birds){
            printOne(bird);
        }
    }
}

