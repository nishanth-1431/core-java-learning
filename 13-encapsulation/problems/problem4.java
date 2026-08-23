/* 4. Employee Management System
A company wants to manage information about its employees.
    Create an Employee class that stores:
    •	Employee ID
    •	Employee name
    •	Department
    •	Salary
    Requirements:
    •	Protect the employee information from direct access.
    •	Allow the application to read employee details.
    •	Allow the employee name, department, and salary to be updated.
    •	Display complete employee information.
    •	Use the this keyword where appropriate.
    Think about why salary should not be directly accessible.
*/
class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    // Getters to read employee information
    int getEmployeeId() {
        return employeeId;
    }

    String getEmployeeName() {
        return employeeName;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }

    // Update methods
    void updateEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    void updateName(String employeeName) {
        this.employeeName = employeeName;
    }

    void updateDepartment(String department) {
        this.department = department;
    }

    void updateSalary(double salary) {
        this.salary = salary;
    }
}

public class problem4 {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.updateEmployeeId(101);
        employee.updateName("John");
        employee.updateDepartment("IT");
        employee.updateSalary(50000.0);

        System.out.println("Employee ID : " + employee.getEmployeeId());
        System.out.println("Name        : " + employee.getEmployeeName());
        System.out.println("Department  : " + employee.getDepartment());
        System.out.println("Salary      : " + employee.getSalary());
    }
}
