/*7. Employee
Create an Employee class.
Fields:
- id
- name
- salary
Method:
- incrementSalary(int amount)
Print the salary before and after incrementing it.
Topics Used:
- Method Parameters
- Objects
 */
class Employee {

    // Fields
    int id;
    String name;
    double salary;

    // Method to increment salary
    void incrementSalary(int amount) {
        salary = salary + amount;
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }
}

public class problem7 {
    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee();

        // Assigning values
        emp.id = 101;
        emp.name = "Nishanth";
        emp.salary = 30000;

        // Salary before increment
        System.out.println("Before Salary Increment:");
        emp.displayEmployee();

        // Increment salary
        emp.incrementSalary(5000);

        // Salary after increment
        System.out.println("\nAfter Salary Increment:");
        emp.displayEmployee();
    }
}