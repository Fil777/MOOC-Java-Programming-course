/**
 *
 * @author Fil
 */
public class Observations {
    private final Birds bird;
    private int observed;

    public Observations(Birds bird){
        this.bird = bird;
        this.observed = 0;
    }

    public void add(){
        observed++;
    }

    public String getBirdName(){
        return bird.getName();
    }

    public int getObserved(){
        return observed;
    }

    public Birds getBird(){
        return bird;
    }

    @Override
    public String toString(){
        return this.bird.toString() + ": " + observed + " observations";
    }
}
