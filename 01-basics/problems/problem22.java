// Write a Java program using Scanner to create a mini ATM balance display system.
import java.util.Scanner;
public class problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;
        System.out.println("Initial Balance: " + balance);
        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawal = sc.nextDouble();
        double newBalance = balance + deposit - withdrawal;
        System.out.println("\n--- ATM Transaction Summary ---");
        System.out.println("Deposited: " + deposit);
        System.out.println("Withdrawn: " + withdrawal);
        System.out.println("Current Balance: " + newBalance);
    }
}
