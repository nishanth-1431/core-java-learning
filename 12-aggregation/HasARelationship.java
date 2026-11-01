/*
 Aggregation

    Definition:
    Aggregation is a HAS-A relationship between two classes.
    One class contains a reference to an object of another class.

    Example:
    An Employee HAS-A Address.

    Syntax:

    class ClassA {
        ClassB object;
    }

    Here, ClassA has a reference to ClassB.

    Technical Note:
    Declaring 'Address address' only creates a reference variable.
    It does not create an Address object.

    The actual object is created using 'new':

    Address address = new Address();

    The Address object can then be assigned to the Employee:

    employee.address = address;
*/

class Address {

    String city;
}

class Employee {

    String name;

    // Employee HAS-A Address
    Address address;
}

public class HasARelationship {

    public static void main(String[] args) {
        
        Address address = new Address();     // Creating an Address object

        address.city = "Coimbatore";         // Assigning a value to the Address object

        Employee employee = new Employee();  // Creating an Employee object

        employee.name = "Nishanth";          // Assigning a value to the Employee object

        employee.address = address;          // Connecting Employee with Address

        // Accessing Employee data
        System.out.println("Employee: " + employee.name);

        // Accessing Address data through Employee
        System.out.println("City: " + employee.address.city);
    }
}
