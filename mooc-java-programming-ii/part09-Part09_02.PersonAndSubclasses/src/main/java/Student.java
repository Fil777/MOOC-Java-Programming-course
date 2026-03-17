/**
 *
 * @author Fil
 */
public class Student extends Person {
    private int studentCredits;
    
    public Student(String name, String address){
        super(name, address);
        studentCredits = 0;
    }
    
    public int credits(){
        return studentCredits;
    }
    
    public void study(){
        studentCredits++;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n  Study credits " + studentCredits;
    }
    
}
