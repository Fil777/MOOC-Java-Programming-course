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
    private final String author;
    private final String title;
    private final int pages;
        
    public Book(String bookAuthor, String bookTitle, int pagesTotal){
        author = bookAuthor;
        title = bookTitle;
        pages = pagesTotal;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getName(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    @Override
    public String toString(){
        return author + ", " + title + ", " + pages + " pages";
    }
}

