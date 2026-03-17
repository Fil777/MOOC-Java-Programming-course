
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for (Movable movable : herd){
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Movable movable : herd){
            str += movable.toString() + "\n";
        }
        return str;
    }
}
