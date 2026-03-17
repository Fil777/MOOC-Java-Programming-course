/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Book {
    private final String bookTitle;
    private final int pagesTotal;
    private final int publicationYear;
    
    public Book(String bookTitle, int pagesTotal, int publicationYear){
        this.bookTitle = bookTitle;
        this.pagesTotal = pagesTotal;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle(){
        return bookTitle;
    }
    
    public String toString(){
        return bookTitle + ", " + pagesTotal + " pages, " + publicationYear;
    }
}
