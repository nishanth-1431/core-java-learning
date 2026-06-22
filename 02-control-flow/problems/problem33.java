/*33.	Railway Ticket Price Calculator
Using (if-else-if ladder)
Calculate railway ticket price based on age and gender (senior discount, child discount).
*/
import java.util.Scanner;

public class problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseFare = 500;
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);
        
        double discountPercent = 0;
        
        if (age < 5) {
            discountPercent = 100; // Free for children under 5
        } else if (age >= 60) {
            discountPercent = 40;  // 40% senior citizen discount
        } else if (age >= 5 && age <= 12) {
            discountPercent = 50;  // 50% child discount
        } else if (gender == 'F') {
            discountPercent = 10;  // 10% female discount for general category
        }
        
        double discountAmount = baseFare * (discountPercent / 100.0);
        double finalPrice = baseFare - discountAmount;
        
        System.out.println("Base Fare: " + baseFare);
        System.out.println("Discount Percent applied: " + discountPercent + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Ticket Price: " + finalPrice);
    }
}
