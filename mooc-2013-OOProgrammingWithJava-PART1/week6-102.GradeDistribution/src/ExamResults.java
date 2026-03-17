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

public class ExamResults {
    private final ArrayList<ExamScore> examResults;

    public ExamResults(){
        examResults = new ArrayList<ExamScore>();        
    }
    
    public int size(){
        return examResults.size();
    }
    
    public ExamScore getResults(int index){
        return examResults.get(index);    }
    
    public int getScore(int index){
        return examResults.get(index).getScore();    
    }

    public int getGrade(int index){
        return examResults.get(index).getGrade();    
    }

    public void add(Integer score){
        examResults.add(new ExamScore(score));
    }
    
    public void printAll(){
        for (ExamScore res : examResults){
            res.print();
        }
    }    
}
