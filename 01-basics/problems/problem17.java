// Write a Java program using Scanner to read two numbers and print multiplication result.
import java.util.Scanner;
public class problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double product = num1 * num2;
        System.out.println("Multiplication Result: " + product);
    }
}
