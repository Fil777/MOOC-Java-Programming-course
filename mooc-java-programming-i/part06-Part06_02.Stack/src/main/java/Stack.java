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
public class Stack {
    private final ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public void add(String value) {
        stack.add(0, value);
    }
    
    public ArrayList<String> values(){
        return stack;
    }
    
    public String take(){
        String res = stack.get(0);
        stack.remove(0);
        return res;        
    }
}
