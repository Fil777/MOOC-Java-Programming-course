/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Item {
    private String id;
    private String name;
    
    Item(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getId(){
        return id;
    }
    
    public boolean equals(Item compared){
        return this.id.equals(compared.id);
    }
    
    @Override
    public String toString(){
        return id + ": " + name;
    }
}
