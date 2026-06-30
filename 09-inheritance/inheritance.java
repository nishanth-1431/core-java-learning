/*
What is Inheritance?
Inheritance is an Object-Oriented Programming (OOP) concept in Java
where one class acquires the properties (fields) and behaviors (methods)
of another class.

Benefits of Inheritance:
1. Code Reusability
2. Easy Maintenance
3. Method Reusability
4. Supports Hierarchical Relationships

Syntax:

class Parent {
    // fields and methods
}

class Child extends Parent {
    // additional fields and methods
}
*/

public class inheritance {

    // Program execution starts from the main() method
    public static void main(String[] args) {

        // Creating an object of the child class
        vehicle v = new vehicle();

        // Calling the child class method
        v.engine();

        // Calling the inherited parent class method
        v.speed();
    }
}

/*
Parent Class (Superclass)

This class contains common methods
that can be inherited by other classes.
*/
class car {

    // Displays the speed of the car
    void speed() {
        System.out.println("100 kmph");
    }
}

/*
Child Class (Subclass)

The extends keyword is used to inherit
the properties and methods of the parent class.

vehicle inherits the speed() method from car.
*/
class vehicle extends car {

    // Displays the engine type
    void engine() {
        System.out.println("Petrol");
    }
}

/*
Program Flow

car (Parent)
      |
      | extends
      v
vehicle (Child)

Object Created:
vehicle v = new vehicle();

Method Calls:
v.engine();   // Child class method
v.speed();    // Parent class method

Output:
Petrol
100 kmph
*/