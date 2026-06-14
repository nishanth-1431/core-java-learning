// Write a Java program using Scanner to calculate discount amount for shopping.
import java.util.Scanner;
public class problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();
        double discountAmount = (price * discountPercent) / 100.0;
        double finalPrice = price - discountAmount;
        System.out.println("\n--- Shopping Bill ---");
        System.out.println("Original Price: " + price);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
    }
}
