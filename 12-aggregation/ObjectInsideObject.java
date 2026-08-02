
/* Creating Objects Inside Other Objects :

    A class can contain an object of another class as a field.

    Example:

    Car HAS-A Engine

    The Engine object can be accessed through the Car object.

    Syntax:

    class Car {
        Engine engine = new Engine();
    }

    Here, when a Car object is created, an Engine object is also
    created and stored in the engine reference.
*/

class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    String brand;

    /* Car HAS-A Engine.
        An Engine object is created and assigned to the
        engine reference.
    */
    Engine engine = new Engine();

    void drive() {
        engine.start(); // Accessing the Engine object through Car.
        System.out.println(brand + " is driving");
    }
}

public class ObjectInsideObject {

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "BMW";
        car.drive();      // Calling the Car's method. Inside drive(), the Car accesses its Engine. 
    }
}

