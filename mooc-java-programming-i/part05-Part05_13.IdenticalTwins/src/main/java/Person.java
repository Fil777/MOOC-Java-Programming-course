
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return name + ", " + birthday.toString() + ", " + String.valueOf(height) + ", " + String.valueOf(weight);
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Person)) {
            return false;
        }

        // let's cast the object to SimpleDate
        Person otherPerson = (Person) compared;
        
        return this.toString().equals(otherPerson.toString());
    }
}
