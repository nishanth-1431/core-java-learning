/*36.	Bank ATM Simulation
Using (switch, if-else)
Simulate bank ATM transactions (check balance, deposit, withdraw). Initial balance = 10000.
*/
import java.util.Scanner;

public class problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        
        System.out.println("--- Bank ATM Simulation ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Your current balance is: $" + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: $");
                double depositAmount = sc.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    System.out.println("Deposit successful. Updated balance: $" + balance);
                } else {
                    System.out.println("Error: Invalid deposit amount.");
                }
                break;
            case 3:
                System.out.print("Enter withdrawal amount: $");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount > 0) {
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
                    } else {
                        System.out.println("Error: Insufficient balance.");
                    }
                } else {
                    System.out.println("Error: Invalid withdrawal amount.");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid choice.");
                break;
        }
    }
}
