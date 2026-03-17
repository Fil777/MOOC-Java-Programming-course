import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by points");
        try {
            NHLStatistics.sortByPoints();
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.toString());
            //throw e;
        }
        
        //NHLStatistics.top(10);
        
        //NHLStatistics.teamStatistics("NYR");  // Statistics of New York Rangers
    }
}
