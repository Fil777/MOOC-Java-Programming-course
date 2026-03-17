
public class HealthStation {
    private int numberOfWeighings ;
    
    public HealthStation(){
        numberOfWeighings = 0;
    }
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        numberOfWeighings++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings(){
        return numberOfWeighings;
    }
}
