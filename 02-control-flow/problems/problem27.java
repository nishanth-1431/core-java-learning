/*27.	College Admission Eligibility
Using (nested if)
Check eligibility based on marks and entrance score.
*/
import java.util.Scanner;

public class problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter school marks (0-100): ");
        double schoolMarks = sc.nextDouble();
        
        if (schoolMarks >= 60) {
            System.out.print("Enter entrance score (0-100): ");
            double entranceScore = sc.nextDouble();
            if (entranceScore >= 50) {
                System.out.println("Eligible for college admission.");
            } else {
                System.out.println("Not eligible. Reason: Entrance exam score is below 50.");
            }
        } else {
            System.out.println("Not eligible. Reason: School marks are below 60.");
        }
    }
}
