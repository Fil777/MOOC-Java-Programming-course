
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
        printPersons(persons);
    }

    public static void printPersons1(ArrayList<Person> persons) {
        Teacher teacher;
        Student student;
        for (Person person : persons) {
            if (person.getClass() == Teacher.class) {
                teacher = (Teacher) person;
                System.out.println(teacher);
            } else if (person.getClass() == Student.class) {
                student = (Student) person;
                System.out.println(student);
            }
        }
    }

    public static void printPersons2(ArrayList<Person> persons) {
        for (Person person : persons) {
            if (person instanceof Teacher) {
                System.out.println((Teacher) person);
            } else if (person instanceof Student) {
                System.out.println((Student) person);
            }
        }
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
