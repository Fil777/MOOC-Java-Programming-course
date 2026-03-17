
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
/*
        String input = "Carl Gustaf Mannerheim\n015696234"
                + "\nLinus Torvalds\n011288989"
                + "\nEdsger Dijkstra\n014662803"
                + "\nSteve Jobs\n013672548"
                + "\nend";
        Scanner reader = new Scanner(input);
*/
        Scanner reader = new Scanner(System.in);
        
        while (true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty() || name.equalsIgnoreCase("end")) break;
            System.out.print("studentnumber: ");
            String number = reader.nextLine();
            Student student = new Student(name, number);
            list.add(student);
        }
        
        for (Student student : list){
            System.out.println(student.toString());
        }
        
        System.out.print("Give search term: ");
        String pattern = reader.nextLine();
        System.out.println("Result:");
        for (Student student : list){
            if (student.getName().contains(pattern))
                System.out.println(student.toString());
        }
    }
}
