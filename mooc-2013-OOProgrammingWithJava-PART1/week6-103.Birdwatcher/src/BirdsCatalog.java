import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class BirdsCatalog {
    private ArrayList<Birds> birds;

    public BirdsCatalog(){
        birds = new ArrayList<Birds>();
    }

    public void add(Birds bird){
        if (contains(bird.getName())) return;
        birds.add(bird);
    }

    public boolean contains(String birdName){
        for (Birds birdInList : birds){
            if (birdInList.getName().equalsIgnoreCase(birdName)) return true;
        }
        return false;
    }

    public Birds getBird(String birdName){
        for (Birds birdInList : birds){
            if (birdInList.getName().equalsIgnoreCase(birdName)) return birdInList;
        }
        return null;
    }
}
