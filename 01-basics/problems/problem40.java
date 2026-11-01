// Write a Java program using DataInputStream to read bank customer details.
import java.io.DataInputStream;
import java.io.IOException;

public class problem40 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Account Number: ");
        String accNum = dis.readLine();
        System.out.print("Enter Account Holder Name: ");
        String name = dis.readLine();
        System.out.print("Enter Account Type: ");
        String accType = dis.readLine();
        System.out.print("Enter Current Balance: ");
        double balance = Double.parseDouble(dis.readLine());
        
        System.out.println("\n--- Bank Customer Details ---");
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Type: " + accType);
        System.out.println("Current Balance: " + balance);
    }
}
