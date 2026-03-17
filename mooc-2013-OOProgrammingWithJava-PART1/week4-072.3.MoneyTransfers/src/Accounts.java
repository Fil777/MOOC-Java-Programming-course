
public class Accounts {

    public static void main(String[] args) {
        
        Account aAccount = new Account("A account",100.00);
        Account bAccount = new Account("B account",0.00);
        Account cAccount = new Account("C account",0.00);
        transfer(aAccount, bAccount, 50.0);
        transfer(bAccount, cAccount, 25.0);
        
        //System.out.println(aAccount);   
        //System.out.println(bAccount);   
        //System.out.println(cAccount);   
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
