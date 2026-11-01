// Write a Java program using Scanner to calculate salary deduction amount.
import java.util.Scanner;
public class problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gross Salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Enter Provident Fund (PF) percentage: ");
        double pfPercentage = sc.nextDouble();
        System.out.print("Enter Professional Tax (PT): ");
        double pt = sc.nextDouble();
        double pfDeduction = (grossSalary * pfPercentage) / 100.0;
        double totalDeduction = pfDeduction + pt;
        System.out.println("\n--- Salary Deduction Summary ---");
        System.out.println("PF Deduction: " + pfDeduction);
        System.out.println("Professional Tax: " + pt);
        System.out.println("Total Deduction Amount: " + totalDeduction);
    }
}
