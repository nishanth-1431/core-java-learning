/*26.	Login Validation System
Using (nested if)
Validate username and password.
*/
import java.util.Scanner;

public class problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "password123";
        
        System.out.print("Enter username: ");
        String username = sc.next();
        
        if (username.equals(correctUsername)) {
            System.out.print("Enter password: ");
            String password = sc.next();
            if (password.equals(correctPassword)) {
                System.out.println("Login validation successful. Welcome!");
            } else {
                System.out.println("Login validation failed. Incorrect password.");
            }
        } else {
            System.out.println("Login validation failed. Incorrect username.");
        }
    }
}
