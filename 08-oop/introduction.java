/* Object-Oriented Programming (OOP) :

    - A class is a blueprint that defines the properties and behaviors
of an object. In this program, Car is a class.

    - An object is an instance of a class created at runtime.
Here, c1 is an object of the Car class.

    - Classes are used in Java to organize related data and methods
into a single unit. They improve code readability, reusability,
and maintainability.

    - OOP helps developers write structured and scalable programs by
creating objects from classes and allowing them to interact with
each other.
*/
public class introduction {
    public static void main(String[] args) {

        // Creating an object of the Car class
        Car c1 = new Car();

        // Accessing the instance variable using the object
        System.out.println(c1.colour);

        // Calling the method using the object
        c1.drive();
    }
}

// Class definition (blueprint)
class Car {

    // Instance variable (attribute)
    String colour = "red";

    // Method (behavior)
    void drive() {
        System.out.println("Car is driving");
    }
}


