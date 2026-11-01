/*37.	Restaurant Billing System
Using (switch, if-else)
Input food choice and quantity. Calculate total bill. Apply 10% discount for members, add 5% GST.
*/
import java.util.Scanner;

public class problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Restaurant Menu ---");
        System.out.println("1. Burger - $5.00");
        System.out.println("2. Pizza - $10.00");
        System.out.println("3. Fries - $3.00");
        System.out.println("4. Drink - $2.00");
        System.out.print("Select item (1-4): ");
        int choice = sc.nextInt();
        
        double price = 0;
        String itemName = "";
        
        switch (choice) {
            case 1:
                price = 5.00;
                itemName = "Burger";
                break;
            case 2:
                price = 10.00;
                itemName = "Pizza";
                break;
            case 3:
                price = 3.00;
                itemName = "Fries";
                break;
            case 4:
                price = 2.00;
                itemName = "Drink";
                break;
            default:
                System.out.println("Error: Invalid item choice.");
                return;
        }
        
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        
        if (qty > 0) {
            double subtotal = price * qty;
            System.out.print("Are you a member? (yes/no): ");
            String memberInput = sc.next().toLowerCase();
            boolean isMember = memberInput.equals("yes") || memberInput.equals("y");
            
            double discount = 0;
            if (isMember) {
                discount = subtotal * 0.10; // 10% discount
            }
            
            double discountedSubtotal = subtotal - discount;
            double tax = discountedSubtotal * 0.05; // 5% GST
            double grandTotal = discountedSubtotal + tax;
            
            System.out.println("\n--- Invoice ---");
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + qty);
            System.out.println("Subtotal: $" + subtotal);
            if (isMember) {
                System.out.println("Member Discount (10%): -$" + discount);
            }
            System.out.println("Tax (5%): $" + tax);
            System.out.println("Grand Total: $" + grandTotal);
        } else {
            System.out.println("Error: Quantity must be greater than zero.");
        }
    }
}
