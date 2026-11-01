// Write a Java program using Scanner to calculate average of 3 numbers.
import java.util.Scanner;
public class problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        double average = (a + b + c) / 3.0;
        System.out.println("Average of the 3 numbers: " + average);
    }
}
