// Write a Java program using Scanner to calculate net salary.
import java.util.Scanner;
public class problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        System.out.print("Enter House Rent Allowance (HRA): ");
        double hra = sc.nextDouble();
        System.out.print("Enter Travel Allowance (TA): ");
        double ta = sc.nextDouble();
        System.out.print("Enter Professional Tax Deduction (PT): ");
        double pt = sc.nextDouble();
        double grossSalary = basicSalary + hra + ta;
        double netSalary = grossSalary - pt;
        System.out.println("\n--- Salary Statement ---");
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}
