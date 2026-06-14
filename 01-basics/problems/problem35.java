// Write a Java program using DataInputStream to read product details and print bill.
import java.io.DataInputStream;
import java.io.IOException;

public class problem35 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Product Name: ");
        String name = dis.readLine();
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(dis.readLine());
        System.out.print("Enter Quantity: ");
        int qty = Integer.parseInt(dis.readLine());
        
        double total = price * qty;
        System.out.println("\n--- Product Bill ---");
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: " + total);
    }
}
