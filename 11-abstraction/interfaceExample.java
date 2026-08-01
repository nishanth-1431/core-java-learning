/*
Definition

Interface is used to achieve:
1. Full abstraction
2. Multiple inheritance

Interface contains:
1. Abstract methods
2. public static final variables

Syntax:

interface Vehicle {
    void start();
}

Example:
Vehicle is an interface.
Car implements the Vehicle interface.
The Car class provides the implementation of the start() method.
*/

interface Vehicle {

    int Speed = 120;

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

public class interfaceExample {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();

        System.out.println("Maximum Speed: " + Vehicle.Speed);
    }
}
