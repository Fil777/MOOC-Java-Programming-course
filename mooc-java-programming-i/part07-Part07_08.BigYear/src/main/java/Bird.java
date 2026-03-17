/**
 *
 * @author Fil
 */
public class Bird {
    private final String name;
    private final String latinName;
    private int observed;

    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName(){
        return name;
    }

    public String getLatinName(){
        return latinName;
    }
    
    public int getObserved(){
        return observed;
    }

    public void addObservation(){
        observed++;
    }
    
    public String toString(){
        return name + " (" + latinName + "): " + observed + " observations";
    }
}