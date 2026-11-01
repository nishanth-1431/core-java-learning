/* Problem 7 – Vehicle Start (Method Overriding)
Create a parent class Vehicle with a method start().
Create child classes Car, Bike, and Truck that override the start() method.
 */
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with self-start button.");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck starts with  heavy-duty engine.");
    }
}

public class problem7 {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Truck();

        v1.start();
        v2.start();
        v3.start();
    }
}