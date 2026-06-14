// Write a Java program using Scanner to create a hotel bill calculator.
import java.util.Scanner;
public class problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Food Item Price: ");
        double itemPrice = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        double subTotal = itemPrice * qty;
        double gstRate = 5.0; // 5% GST for hotel
        double gstAmount = (subTotal * gstRate) / 100.0;
        double grandTotal = subTotal + gstAmount;
        System.out.println("\n--- Hotel Bill ---");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("GST (5%): " + gstAmount);
        System.out.println("Grand Total: " + grandTotal);
    }
}
