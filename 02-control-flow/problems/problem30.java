/*30.	E-Commerce Discount Calculator
Using (nested if)
Calculate discount based on purchase amount and membership status.
*/
import java.util.Scanner;

public class problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        
        System.out.print("Are you a Premium member? (yes/no): ");
        String membership = sc.next().toLowerCase();
        boolean isPremium = membership.equals("yes") || membership.equals("y");
        
        double discountPercent = 0;
        
        if (amount >= 1000) {
            if (isPremium) {
                discountPercent = 20;
            } else {
                discountPercent = 10;
            }
        } else {
            if (isPremium) {
                discountPercent = 5;
            } else {
                discountPercent = 0;
            }
        }
        
        double discountAmount = amount * (discountPercent / 100.0);
        double finalBill = amount - discountAmount;
        
        System.out.println("Discount Percent: " + discountPercent + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Bill Amount: " + finalBill);
    }
}
