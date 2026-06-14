// Write a Java program using DataInputStream to read employee details.
import java.io.DataInputStream;
import java.io.IOException;

public class problem32 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(dis.readLine());
        System.out.print("Enter Employee Name: ");
        String name = dis.readLine();
        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(dis.readLine());
        
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
