// Write a Java program using Scanner to calculate mobile recharge amount.
import java.util.Scanner;
public class problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Recharge Plan Price: ");
        double planPrice = sc.nextDouble();
        System.out.print("Enter Service Tax percentage: ");
        double taxPercent = sc.nextDouble();
        double taxAmount = (planPrice * taxPercent) / 100.0;
        double totalAmount = planPrice + taxAmount;
        System.out.println("Plan Price: " + planPrice);
        System.out.println("Service Tax: " + taxAmount);
        System.out.println("Total Recharge Amount: " + totalAmount);
    }
}
