/*28.	Bank Loan Eligibility
Using (nested if)
Check eligibility based on age, salary, and CIBIL score.
*/
import java.util.Scanner;

public class problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        if (age >= 21 && age <= 60) {
            System.out.print("Enter monthly salary: ");
            double salary = sc.nextDouble();
            if (salary >= 25000) {
                System.out.print("Enter CIBIL score (300-900): ");
                int cibil = sc.nextInt();
                if (cibil >= 750) {
                    System.out.println("Eligible for bank loan.");
                } else {
                    System.out.println("Not eligible. Reason: CIBIL score is below 750.");
                }
            } else {
                System.out.println("Not eligible. Reason: Monthly salary is below 25000.");
            }
        } else {
            System.out.println("Not eligible. Reason: Age must be between 21 and 60.");
        }
    }
}
