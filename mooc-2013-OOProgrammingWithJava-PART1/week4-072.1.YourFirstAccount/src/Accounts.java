
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        
        Account bartosAccount = new Account("Barto's account",100.00);
        bartosAccount.deposit(20);
        System.out.println(bartosAccount);
        
    }

}
