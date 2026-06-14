/*  16.	Electricity Bill Calculator
Using (if-else-if ladder)
Calculate electricity bill based on units consumed. 
 */
import java.util.Scanner;
public class problem16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed :");
        int units = sc.nextInt();
        double bill;
        if(units<=100){
            bill = units * 0.5;
        }
        else if(units<=200){
            bill = 100 * 0.5 + (units - 100) * 0.75;
        }
        else if(units<=300){
            bill = 100 * 0.5 + 100 * 0.75 + (units - 200) * 1.2;
        }
        else{
            bill = 100 * 0.5 + 100 * 0.75 + 100 * 1.2 + (units - 300) * 1.5;
        }
        System.out.printf("The electricity bill for %d units is: %.2f", units, bill);
    }
    
}
