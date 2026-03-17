import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        int read = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers: ");
        while (!(read == -1)) {
            sum += read;
            num++;
            read = Integer.parseInt(reader.nextLine());
            if (read % 2 == 0) even++;
            else odd++;
        } 
        num--;
        odd--;
        System.out.println("Thank you and see you later!" 
            + "\nThe sum is " + sum
            + "\nHow many numbers: " + num
            + "\nAverage: " + ( new Double(sum) / num)
            + "\nEven numbers: " + even
            + "\nOdd numbers: " + odd
        );
    }
}
