/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class ExamScore {
    private final Integer score;
    private final Integer grade;
    
    public ExamScore(Integer score){
        this.score = score;
        this.grade = Grades.gradeOfScore(score);
    }
    
    public Integer getScore(){
        return score;
    }
    
    public Integer getGrade(){
        return grade;
    }
    
    @Override
    public String toString(){
        return "Score: "+ score + " Grade: " + grade;
    }
    
    public void print(){
        System.out.println(this.toString());
    }
}
