// Write a Java program using Scanner to read employee ID, name, and salary.
import java.util.Scanner;
public class problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
