// Write a Java program using DataInputStream to create a user registration form.
import java.io.DataInputStream;
import java.io.IOException;

public class problem34 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Username: ");
        String username = dis.readLine();
        System.out.print("Enter Email Address: ");
        String email = dis.readLine();
        System.out.print("Enter Password: ");
        String password = dis.readLine();
        
        System.out.println("\n--- User Registration Details ---");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: [HIDDEN]");
    }
}
