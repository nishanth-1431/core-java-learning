/*32.	Income Tax Calculator
Using (if-else-if ladder)
Calculate income tax based on income brackets.
*/
import java.util.Scanner;

public class problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();
        
        double tax = 0;
        
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            tax = (500000 - 250000) * 0.05 + (income - 500000) * 0.20;
        } else {
            tax = (500000 - 250000) * 0.05 + (1000000 - 500000) * 0.20 + (income - 1000000) * 0.30;
        }
        
        System.out.println("Income tax to be paid: " + tax);
    }
}
