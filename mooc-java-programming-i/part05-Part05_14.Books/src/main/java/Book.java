
import java.util.Objects;


public class Book {

    private final String name;
    private final int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public String toString(){
        return name + ", " + publicationYear;
    }
    
    @Override
    public boolean equals(Object compared){
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        Book otherBook = (Book) compared;
        return this.toString().equals(compared.toString());        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.publicationYear;
        return hash;
    }

}
