/*
Problem 3 - Employee Salary

Create an abstract class Employee.
• Create an abstract method calculateSalary().
• Create FullTimeEmployee and PartTimeEmployee.
• Display the salary of each employee.
*/

abstract class Employee {
    abstract int calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    int calculateSalary() {
        return 30000;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    int calculateSalary() {
        int hours = 80;
        int hourlyRate = 200;

        return hours * hourlyRate;
    }
}

public class problem3 {
    public static void main(String[] args) {

        FullTimeEmployee fullTime = new FullTimeEmployee();
        PartTimeEmployee partTime = new PartTimeEmployee();

        System.out.println("Full-Time Salary : " + fullTime.calculateSalary());
        System.out.println("Part-Time Salary : " + partTime.calculateSalary());
    }
}