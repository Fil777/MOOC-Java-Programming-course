
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fil
 */
public class Room {

    private final ArrayList<Person> room;

    public Room() {
        room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        return room.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person shortest() {
        int index = indexOfShortest();
        
        if (index < 0) {
            return null;
        }
        
        Person shortest = room.get(index);
        return new Person(shortest.getName(), shortest.getHeight());
    }

    public Person take() {
        int index = indexOfShortest();
        
        if (index < 0) {
            return null;
        }
        
        Person shortest = shortest();
        
        room.remove(index);            
        
        return shortest;
    }

    private int indexOfShortest() {
        if (room.isEmpty()) {
            return -1;
        } else if (room.size() == 1){
            return 0;
        }
        int index = 0;
        for (int i = 1; i < room.size(); i++) {
            if (room.get(i).getHeight() < room.get(index).getHeight()) {
                index = i;
            }
        }
        return index;
    }


}
