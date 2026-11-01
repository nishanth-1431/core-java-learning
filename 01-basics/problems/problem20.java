// Write a Java program using Scanner to read customer details and print invoice.
import java.util.Scanner;
public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();
        System.out.print("Enter Price per unit: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        double total = price * quantity;
        System.out.println("\n--- INVOICE ---");
        System.out.println("Customer: " + name);
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
    }
}
