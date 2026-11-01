/*29.	Employee Promotion Eligibility
Using (nested if)
Check promotion eligibility based on experience and performance.
*/
import java.util.Scanner;

public class problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();
        
        if (experience >= 3) {
            System.out.print("Enter performance rating (A, B, or C): ");
            char rating = sc.next().toUpperCase().charAt(0);
            if (rating == 'A' || rating == 'B') {
                System.out.println("Eligible for promotion.");
            } else {
                System.out.println("Not eligible. Reason: Performance rating must be A or B.");
            }
        } else {
            System.out.println("Not eligible. Reason: Minimum experience of 3 years required.");
        }
    }
}
