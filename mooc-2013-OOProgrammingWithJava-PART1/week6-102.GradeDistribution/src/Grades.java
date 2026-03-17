/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fil
 */
public class Grades {
    private final static int[] points = { 0, 30, 35, 40, 45, 50, 60};
    public  final static int[] grades = {-1,  0,  1,  2,  3,  4,  5};
    
    public static int gradeOfScore(int score){
        if      (score <  points[0]) return grades[0]; //fail
        else if (score <  points[1]) return grades[1];
        else if (score <  points[2]) return grades[2];
        else if (score <  points[3]) return grades[3];
        else if (score <  points[4]) return grades[4];
        else if (score <  points[5]) return grades[5];
        else if (score <= points[6]) return grades[6];
        else return grades[0]; //fail
    }
}
