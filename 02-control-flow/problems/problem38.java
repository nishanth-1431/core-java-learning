/*38.	Movie Ticket Booking System
Using (switch, nested if)
Select screen (1. Regular - $10, 2. IMAX - $15). Choose seat type (1. Normal - $0, 2. VIP - +$5). Input ticket quantity. 10% discount for students.
*/
import java.util.Scanner;

public class problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Movie Ticket Booking ---");
        System.out.println("1. Regular Screen ($10.00)");
        System.out.println("2. IMAX Screen ($15.00)");
        System.out.print("Select screen type (1-2): ");
        int screenChoice = sc.nextInt();
        
        double basePrice = 0;
        String screenType = "";
        
        switch (screenChoice) {
            case 1:
                basePrice = 10.00;
                screenType = "Regular";
                break;
            case 2:
                basePrice = 15.00;
                screenType = "IMAX";
                break;
            default:
                System.out.println("Error: Invalid screen selection.");
                return;
        }
        
        System.out.println("Select seat type:");
        System.out.println("1. Normal Seat (No extra charge)");
        System.out.println("2. VIP Seat (+$5.00 extra charge)");
        System.out.print("Select option (1-2): ");
        int seatChoice = sc.nextInt();
        
        double extraCharge = 0;
        String seatType = "";
        
        if (seatChoice == 1) {
            extraCharge = 0;
            seatType = "Normal";
        } else if (seatChoice == 2) {
            extraCharge = 5.00;
            seatType = "VIP";
        } else {
            System.out.println("Error: Invalid seat selection.");
            return;
        }
        
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        
        if (tickets > 0) {
            double ticketPrice = basePrice + extraCharge;
            double subtotal = ticketPrice * tickets;
            
            System.out.print("Are you a student? (yes/no): ");
            String studentInput = sc.next().toLowerCase();
            boolean isStudent = studentInput.equals("yes") || studentInput.equals("y");
            
            double discount = 0;
            if (isStudent) {
                discount = subtotal * 0.10; // 10% student discount
            }
            
            double grandTotal = subtotal - discount;
            
            System.out.println("\n--- Booking Summary ---");
            System.out.println("Screen: " + screenType);
            System.out.println("Seat Type: " + seatType);
            System.out.println("Tickets: " + tickets);
            System.out.println("Price per Ticket: $" + ticketPrice);
            System.out.println("Subtotal: $" + subtotal);
            if (isStudent) {
                System.out.println("Student Discount (10%): -$" + discount);
            }
            System.out.println("Total Amount: $" + grandTotal);
        } else {
            System.out.println("Error: Number of tickets must be greater than zero.");
        }
    }
}
