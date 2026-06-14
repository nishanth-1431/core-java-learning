// Write a Java program using Scanner to calculate train ticket total price.
import java.util.Scanner;
public class problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ticket Price per person: ");
        double price = sc.nextDouble();
        System.out.print("Enter Number of Passengers: ");
        int passengers = sc.nextInt();
        System.out.print("Enter Booking Charges: ");
        double bookingCharges = sc.nextDouble();
        double totalTicketPrice = (price * passengers) + bookingCharges;
        System.out.println("\n--- Ticket Bill ---");
        System.out.println("Total Ticket Price: " + totalTicketPrice);
    }
}
