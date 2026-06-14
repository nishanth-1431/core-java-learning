// Write a Java program using DataInputStream to calculate shopping total.
import java.io.DataInputStream;
import java.io.IOException;

public class problem38 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Item 1 Price: ");
        double item1 = Double.parseDouble(dis.readLine());
        System.out.print("Enter Item 2 Price: ");
        double item2 = Double.parseDouble(dis.readLine());
        
        double total = item1 + item2;
        System.out.println("\nTotal Shopping Amount: " + total);
    }
}
