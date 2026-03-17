
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] gift = {0, 5000, 25000, 55000, 200000, 1000000};
        int[] tax  = {0,  100,  1700,  4700,  22100,  142100};
        int[] rate = {0,    8,    10,    12,     15,      17};

        System.out.println("Value of the gift?");
        int giftSum = Integer.parseInt(reader.nextLine());
//        int giftSum = 944009;

        int index;
        if (giftSum < gift[0]) {
            index = -1;
        } else if (giftSum < gift[1]) {
            index = 0;
        } else if (giftSum < gift[2]) {
            index = 1;
        } else if (giftSum < gift[3]) {
            index = 2;
        } else if (giftSum < gift[4]) {
            index = 3;
        } else if (giftSum < gift[5]) {
            index = 4;
        } else {
            index = 5;
        }
        
        if (index <= 0){
            System.out.println("No tax!");
        } else {
            double taxSum = tax[index] + (giftSum - gift[index]) * (rate[index] / 100.0);
            System.out.println("Tax: " + taxSum);
        }    
    }
}
