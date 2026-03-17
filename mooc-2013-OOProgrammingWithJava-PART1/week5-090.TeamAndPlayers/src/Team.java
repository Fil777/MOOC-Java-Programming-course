
import com.sun.tools.javac.code.Attribute;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Team {

    private String name;
    private int maxSize;
    private ArrayList<Player> teamList;

    public Team(String name) {
        this.name = name;
        maxSize = 16;
        teamList = new ArrayList<Player>();
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return teamList.size();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }

    public void addPlayer(Player player) {
        if (teamList.size() < maxSize) teamList.add(player);
    }
    
    public int goals(){
        int sum = 0;
        for (Player player : teamList){
            sum += player.goals();
        }
        return sum;
    }
    
    public void printPlayers(){
        for (Player player : teamList){
            System.out.println(player.toString());
        }
    }
}
