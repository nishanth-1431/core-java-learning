/*4. Banking System — Bank & Employee
    A bank has many employees.
•	Create Bank and Employee. 
•	Employees can exist independently of the bank. 
•	A bank should be able to add multiple employees. 
•	Display all employees working at the bank. 
•	If the bank object is removed, the employees should still conceptually exist. 
 */
class Employee {

    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println();
    }
}

class Bank {

    String bankName;
    Employee[] employees; // Bank HAS-A Employee

    void displayEmployees() {
        System.out.println("Bank: " + bankName);
        System.out.println("Employees:");

        for (int i = 0; i < employees.length; i++) {
            employees[i].displayEmployee();
        }
    }
}

public class problem4 {

    public static void main(String[] args) {

        // Employees exist independently
        Employee employee1 = new Employee();
        employee1.employeeName = "Arun";
        employee1.employeeId = 101;

        Employee employee2 = new Employee();
        employee2.employeeName = "Priya";
        employee2.employeeId = 102;

        Employee employee3 = new Employee();
        employee3.employeeName = "Karthik";
        employee3.employeeId = 103;

        // Bank object
        Bank bank = new Bank();
        bank.bankName = "ABC Bank";

        // Aggregation
        bank.employees = new Employee[3];

        bank.employees[0] = employee1;
        bank.employees[1] = employee2;
        bank.employees[2] = employee3;

        // Display all employees
        bank.displayEmployees();
    }
}
