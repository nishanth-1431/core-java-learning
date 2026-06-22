/*39.	Electricity Bill with Multiple Slabs
Using (if-else-if ladder)
Calculate electricity bill based on progressive slab pricing (1-100: $1.5/unit, 101-200: $2.5/unit, 201-300: $4.0/unit, >300: $6.0/unit). Minimum charge is $50.
*/
import java.util.Scanner;

public class problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter electricity units consumed: ");
        double units = sc.nextDouble();
        
        double bill = 0;
        
        if (units < 0) {
            System.out.println("Error: Units consumed cannot be negative.");
            return;
        }
        
        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + (units - 300) * 6.0;
        }
        
        // Apply minimum charge of $50
        if (bill < 50) {
            bill = 50;
            System.out.println("Minimum charge applied.");
        }
        
        System.out.println("Total Electricity Bill: $" + bill);
    }
}
