// Write a Java program using DataInputStream to read customer city and mobile number.
import java.io.DataInputStream;
import java.io.IOException;

public class problem33 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Customer City: ");
        String city = dis.readLine();
        System.out.print("Enter Customer Mobile Number: ");
        String mobile = dis.readLine();
        
        System.out.println("\n--- Customer Contact Info ---");
        System.out.println("City: " + city);
        System.out.println("Mobile: " + mobile);
    }
}
