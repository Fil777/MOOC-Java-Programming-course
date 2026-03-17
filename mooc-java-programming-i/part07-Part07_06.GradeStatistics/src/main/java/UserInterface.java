
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fil
 */
public class UserInterface {

    private Scanner scanner;
    private DataStore points;

    public UserInterface(Scanner scanner, DataStore points) {
        this.scanner = scanner;
        this.points = points;
    }

    public void run() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            } 
            points.add(input);
        }
        System.out.println("Point average (all): " + points.average());
        System.out.println("Point average (passing): " + points.averagePassing(50));
        System.out.println("Pass percentage: " + points.passPercentage(50));
//        System.out.println("Grade distribution:");
//        points.printGradesDistribution();
    }
    
}
