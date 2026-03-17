
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
public class DataStore {

    private final ArrayList<Integer> data;

    public DataStore() {
        this.data = new ArrayList<>();
    }

    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.data.add(number);
        }
    }

    public int sum() {
        int s = 0;
        if (data.size() > 0) {
            for (int n : data) {
                s += n;
            }
        }
        return s;
    }

    public String average() {
        if (data.size() == 0) {
            return "-";
        }
        return Double.toString(1.0 * sum() / data.size());
    }

    public String averagePassing(int passValue) {
        if (data.size() == 0) {
            return "-";
        }
        int s = 0;
        int passed = 0;
        for (int n : data) {
            if (n >= passValue) {
                s += n;
                passed++;
            }
        }
        if (passed > 0) {
            return Double.toString(1.0 * s / passed);
        } else {
            return "-";
        }
    }

    public String passPercentage(int passValue) {
        if (data.size() == 0) {
            return "-";
        }
        int passed = 0;
        for (int n : data) {
            if (n >= passValue) {
                passed++;
            }
        }
        return Double.toString(100.0 * passed / data.size());
    }

    public int grade(int point) {
        if (point >= 0 && point < 50) {
            return 0;
        } else if (point < 60) {
            return 1;
        } else if (point < 70) {
            return 2;
        } else if (point < 80) {
            return 3;
        } else if (point < 90) {
            return 4;
        } else if (point <= 100) {
            return 5;
        } else {
            return 6;
        }
    }

    public void printGradesDistribution() {
        int[] gradesStatistics = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < data.size(); i++) {
            gradesStatistics[grade(data.get(i))]++;
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + " :" + starsString(gradesStatistics[i]));
        }
    }

    public String starsString(int starsNumber) {
        String stars = "";
        for (int i = 1; i <= starsNumber; i++) {
            stars += "*";
        }
        return stars;
    }

}
