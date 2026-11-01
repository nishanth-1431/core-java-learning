/*24.	Menu Driven Calculator
Using (switch)
Create a menu-based calculator.
*/
import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Menu Driven Calculator ---");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                double a1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b1 = sc.nextDouble();
                System.out.println("Result: " + (a1 + b1));
                break;
            case 2:
                System.out.print("Enter first number: ");
                double a2 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b2 = sc.nextDouble();
                System.out.println("Result: " + (a2 - b2));
                break;
            case 3:
                System.out.print("Enter first number: ");
                double a3 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b3 = sc.nextDouble();
                System.out.println("Result: " + (a3 * b3));
                break;
            case 4:
                System.out.print("Enter first number: ");
                double a4 = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b4 = sc.nextDouble();
                if (b4 != 0) {
                    System.out.println("Result: " + (a4 / b4));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid choice.");
                break;
        }
    }
}
