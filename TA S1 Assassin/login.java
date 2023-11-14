import java.util.Scanner;

public class login{

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       // Get the username and password from the user.
       System.out.print("Username: ");
       String username = input.nextLine();
       System.out.print("Password: ");
       String password = input.nextLine();

       // Check if the username and password are correct.
       if (username.equals("Vita") && password.equals("Vita1") 
       || username.equals("Sufyan") && password.equals("Sufyan2") 
       || username.equals("Raihan") && password.equals("Raihan3")) {
           System.out.println("Welcome, " + username + "!");
       } else {
           System.out.println("Invalid username or password.");
       }
   }
}
