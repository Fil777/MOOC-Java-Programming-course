/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;
    
    public Library(){
        books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        books.add(newBook);
    }
    
    public void printBooks(){
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book book : this.books){
            if (StringUtils.included(book.title(), title)){
                booksFound.add(book);
            }
        }     
        return booksFound;
    }

    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book book : this.books){
            if (StringUtils.included(book.publisher(), publisher)){
                booksFound.add(book);
            }
        }     
        return booksFound;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book book : this.books){
            if (book.year() == year){
                booksFound.add(book);
            }
        }     
        return booksFound;
    }
    
}
