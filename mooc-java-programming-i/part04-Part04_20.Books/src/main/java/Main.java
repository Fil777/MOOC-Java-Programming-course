
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give books: ");
        while (true) {
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());

            Book info = new Book(title, pages, year);
            bookCollection.add(info);
        }
        System.out.println("What information will be printed? ");
        String what = scanner.nextLine();
        if (what.endsWith("everything")) {
            for (Book book : bookCollection) {
                System.out.println(book.toString());
            }
        } else if (what.endsWith("name")){
            for (Book book : bookCollection) {
                System.out.println(book.getTitle());
            }
        }
    }
}
