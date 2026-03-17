/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Timer {
    private ClockHand hdrSeconds;
    private ClockHand seconds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hdrSeconds = new ClockHand(100);
    }
    
    public void advance(){
        hdrSeconds.advance();
        if (hdrSeconds.value() == 0){
            seconds.advance();
        }
    }
    
    public String toString(){
        return seconds.toString() + ":" + hdrSeconds.toString();
    }
        
}
