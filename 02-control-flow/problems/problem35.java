/*35.	Student Result Management System
Using (if-else-if ladder, nested if)
Input marks of 3 subjects. Check if student passed (min 35 in each). If passed, calculate average and display division.
*/
import java.util.Scanner;

public class problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();
        
        // Nested check: must pass all subjects with score >= 35
        if (s1 >= 35 && s2 >= 35 && s3 >= 35) {
            int total = s1 + s2 + s3;
            double average = total / 3.0;
            System.out.println("Result: PASS");
            System.out.println("Total Marks: " + total);
            System.out.printf("Average Marks: %.2f\n", average);
            
            // if-else-if ladder for classification
            if (average >= 75) {
                System.out.println("Division: Distinction");
            } else if (average >= 60) {
                System.out.println("Division: First Class");
            } else if (average >= 50) {
                System.out.println("Division: Second Class");
            } else {
                System.out.println("Division: Pass Class");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.print("Failed in: ");
            if (s1 < 35) System.out.print("Subject 1 ");
            if (s2 < 35) System.out.print("Subject 2 ");
            if (s3 < 35) System.out.print("Subject 3 ");
            System.out.println();
        }
    }
}
