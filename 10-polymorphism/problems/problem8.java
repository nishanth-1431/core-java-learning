/*Problem 8 – Employee Salary (Method Overriding)
Create a parent class Employee with a method calculateSalary().
 Create child classes Manager, Developer, and Intern that calculate salary differently by overriding the method.
*/
class Employee {
    void calculateSalary() {
        System.out.println("Calculating employee salary...");
    }
}

class Manager extends Employee {
    @Override
    void calculateSalary() {
        int basicSalary = 80000;
        int bonus = 20000;
        System.out.println("Manager Salary: Rs. " + (basicSalary + bonus));
    }
}

class Developer extends Employee {
    @Override
    void calculateSalary() {
        int basicSalary = 60000;
        int bonus = 10000;
        System.out.println("Developer Salary: Rs. " + (basicSalary + bonus));
    }
}

class Intern extends Employee {
    @Override
    void calculateSalary() {
        int stipend = 15000;
        System.out.println("Intern Salary: Rs. " + stipend);
    }
}

public class problem8 {
    public static void main(String[] args) {

        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Intern();

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}