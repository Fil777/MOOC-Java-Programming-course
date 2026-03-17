import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class ObservationsCatalog {
    private final ArrayList<Observations> observations;

    public ObservationsCatalog(){
        observations = new ArrayList<Observations>();
    }

    public Observations initialize(Birds bird){
        Observations observation = getObservation(bird.getName());
        if (observation == null) {
            observation = new Observations(bird);
            observations.add(observation);
        }
        return observation;
    }

    public void add(Birds bird){
        initialize(bird).add();
    }

    public boolean contains(String birdName){
        for (Observations observation : observations){
            if (observation.getBirdName().equalsIgnoreCase(birdName)) return true;
        }
        return false;
    }

    public int size(){
        return this.observations.size();
    }

    public Observations getObservation(int index){
        return this.observations.get(index);
    }

    public Observations getObservation(String birdName){
        for (Observations observation : observations){
            if (observation.getBirdName().equalsIgnoreCase(birdName)) return observation;
        }
        return null;
    }

    public String getBirdStatistics(String birdName){
        Observations observation = getObservation(birdName);
        if (observation == null) return "";
        return observation.toString();
    }

    public String getBirdStatistics(int index){
        return this.getObservation(index).toString();
    }

}
