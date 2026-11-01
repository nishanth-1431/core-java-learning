/*40.	Library Fine Calculator
Using (nested if, if-else-if ladder)
Calculate library late return fine (1-5 days: $1/day, 6-10 days: $2/day, 11-30 days: $5/day, >30 days: $100 flat + suspension).
*/
import java.util.Scanner;

public class problem40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        
        double fine = 0;
        
        if (days <= 0) {
            System.out.println("No fine. Thank you for returning the book on time!");
        } else {
            // Nested check & if-else-if ladder
            if (days <= 5) {
                fine = days * 1.0;
                System.out.println("Fine amount: $" + fine);
            } else if (days <= 10) {
                fine = (5 * 1.0) + (days - 5) * 2.0;
                System.out.println("Fine amount: $" + fine);
            } else if (days <= 30) {
                fine = (5 * 1.0) + (5 * 2.0) + (days - 10) * 5.0;
                System.out.println("Fine amount: $" + fine);
            } else {
                fine = 100.0; // Flat fine for excessive delay
                System.out.println("Fine amount: $" + fine);
                System.out.println("WARNING: Membership has been suspended due to delay exceeding 30 days.");
            }
        }
    }
}
