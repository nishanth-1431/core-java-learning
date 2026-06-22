/*34.	Mobile Recharge Menu System
Using (switch)
Provide options to select recharge plans (Top-up, Data, or Unlimited packs) and displays the cost.
*/
import java.util.Scanner;

public class problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Mobile Recharge Plans ---");
        System.out.println("1. Top-up");
        System.out.println("2. Data Plan");
        System.out.println("3. Unlimited Pack");
        System.out.print("Select options (1-3): ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Select Top-up amount:");
                System.out.println("A. $10 (Talktime: $8)");
                System.out.println("B. $50 (Talktime: $45)");
                System.out.println("C. $100 (Talktime: $95)");
                System.out.print("Enter choice (A, B, C): ");
                char topupChoice = sc.next().toUpperCase().charAt(0);
                switch (topupChoice) {
                    case 'A':
                        System.out.println("Recharge Successful: $10 Top-up.");
                        break;
                    case 'B':
                        System.out.println("Recharge Successful: $50 Top-up.");
                        break;
                    case 'C':
                        System.out.println("Recharge Successful: $100 Top-up.");
                        break;
                    default:
                        System.out.println("Error: Invalid Top-up option.");
                        break;
                }
                break;
                
            case 2:
                System.out.println("Select Data Plan:");
                System.out.println("A. $2 (1GB, 1 Day Validity)");
                System.out.println("B. $5 (5GB, 7 Days Validity)");
                System.out.println("C. $15 (20GB, 30 Days Validity)");
                System.out.print("Enter choice (A, B, C): ");
                char dataChoice = sc.next().toUpperCase().charAt(0);
                switch (dataChoice) {
                    case 'A':
                        System.out.println("Recharge Successful: $2 1GB Data Plan.");
                        break;
                    case 'B':
                        System.out.println("Recharge Successful: $5 5GB Data Plan.");
                        break;
                    case 'C':
                        System.out.println("Recharge Successful: $15 20GB Data Plan.");
                        break;
                    default:
                        System.out.println("Error: Invalid Data Plan option.");
                        break;
                }
                break;
                
            case 3:
                System.out.println("Select Unlimited Pack:");
                System.out.println("A. $15 (Unlimited Calls + 1.5GB/day, 28 Days)");
                System.out.println("B. $40 (Unlimited Calls + 2GB/day, 84 Days)");
                System.out.print("Enter choice (A, B): ");
                char unlimitedChoice = sc.next().toUpperCase().charAt(0);
                switch (unlimitedChoice) {
                    case 'A':
                        System.out.println("Recharge Successful: $15 Unlimited Pack.");
                        break;
                    case 'B':
                        System.out.println("Recharge Successful: $40 Unlimited Pack.");
                        break;
                    default:
                        System.out.println("Error: Invalid Unlimited option.");
                        break;
                }
                break;
                
            default:
                System.out.println("Error: Invalid Recharge Plan choice.");
                break;
        }
    }
}
