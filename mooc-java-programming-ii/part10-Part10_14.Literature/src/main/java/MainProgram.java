
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;
            System.out.println("Input the age recommendation: ");
            Integer age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(name, age));
        }
        
        Collections.sort(books, Comparator.comparing(Book::getAge).thenComparing(Book::getName));
        
        System.out.println(books.stream().count() + " books in total.");
        System.out.println("\nBooks:");
        books.stream().sorted().forEach(b -> System.out.println(b));
        
    }

}
