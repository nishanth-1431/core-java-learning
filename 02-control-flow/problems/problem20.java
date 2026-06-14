/*  20.	Number Comparison
Using (if-else-if ladder)
Compare two numbers and display the result. 
 */
import java.util.*;
public class problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("The first number is greater.");
        } else if (num2 > num1) {
            System.out.println("The second number is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
    

