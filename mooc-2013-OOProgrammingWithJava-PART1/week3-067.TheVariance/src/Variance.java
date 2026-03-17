import java.util.ArrayList;

public class Variance {
    
    public static int sum(ArrayList<Integer> list) {
        int s = 0;
        for (Integer i : list){
            s += Integer.valueOf(i);
        }
        return s;
    }
    
    public static double average(ArrayList<Integer> list) {
        return 1.0 * sum(list) / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double var = 0.0;
        double avg = average(list);
        for (Integer i : list){
            var += Math.pow(avg - (Integer.valueOf(i)), 2);
        }
        return var / (list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
