
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String[] names = {"alex", "emily"};
        String[] passwords = {"mightyducks", "cat"};
        
        System.out.print("Type your username: ");
        String name = reader.nextLine();   

        System.out.print("Type your password: ");
        String pass = reader.nextLine();   
        
        String pair = name + "~" + pass;

        if (pair.equals((String)names[0] + "~" + passwords[0]) 
                || pair.equals((String)names[1] + "~" + passwords[1]))
            System.out.println("You are now logged into the system!");
        else System.out.println("Your username or password was invalid!");
    }
}
