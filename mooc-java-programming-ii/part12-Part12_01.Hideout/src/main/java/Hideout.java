
/**
 *
 * @author Fil
 */
public class Hideout <T> {
    T element;
    
    public Hideout(){
        this.element = null;
    }
    
    public void putIntoHideout(T toHide){
        this.element = toHide;
    }
    
    public T takeFromHideout(){
        T retValue = this.element; 
        this.element = null;
        return retValue;
    }
    
    public boolean isInHideout(){
        return !(this.element == null);
    }
}
