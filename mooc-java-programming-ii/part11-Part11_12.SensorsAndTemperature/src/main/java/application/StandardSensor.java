
package application;

/**
 *
 * @author Fil
 */
public class StandardSensor implements Sensor{
    private int lastRead;
    
    public StandardSensor(int reads){
        lastRead = reads;
    }
    
    @Override
    public int read(){
        return lastRead;
    }
    
    @Override
    public boolean isOn(){
        return true;
    }
    
    @Override
    public void setOn(){
        
    }

    @Override
    public void setOff(){
        
    }

}
