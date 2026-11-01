/*  IS-A vs HAS-A

    IS-A Relationship:
    IS-A represents inheritance.

    Example:
    Dog IS-A Animal.

    HAS-A Relationship:
    HAS-A represents aggregation.

    Example:
    Employee HAS-A Address.

    IS-A uses inheritance with 'extends'.

    HAS-A uses an object reference as a field.
*/

/*
    IS-A Relationship
    Dog is a type of Animal.
*/
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}


/*
    HAS-A Relationship

    Employee is not an Address.
    Employee HAS-A Address.
*/
class Address {

    String city;
}

class Employee {

    String name;

    Address address;
}


public class IsAVsHasA {

    public static void main(String[] args) {

        /*
            IS-A example
            Dog inherits the eat() method from Animal.
        */
        Dog dog = new Dog();

        dog.eat();
        dog.bark();

        /*
            HAS-A example
            Creating an Address object.
        */
        Address address = new Address();

        address.city = "Coimbatore";
        
        Employee employee = new Employee();      // Creating an Employee object.

        employee.name = "Nishanth";

        employee.address = address;              // Employee HAS-A Address.

        System.out.println("Employee: " + employee.name);
        System.out.println("City: " + employee.address.city);
    }
}