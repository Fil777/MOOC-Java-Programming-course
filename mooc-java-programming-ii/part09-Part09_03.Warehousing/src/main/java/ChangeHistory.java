
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double max = history.get(0);
        for (double dbl : history) {
            if (max < dbl) {
                max = dbl;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (double dbl : history) {
            if (min > dbl) {
                min = dbl;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double dbl : history) {
            sum += dbl;
        }
        return sum / history.size();
    }

}
