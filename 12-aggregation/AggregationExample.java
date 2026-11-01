/*   Aggregation represents a HAS-A relationship.

    Example:

    Car HAS-A Engine.

    A Car is not an Engine, so inheritance should not be used.

    Instead, Car contains an Engine reference.

    Aggregation is useful because it represents the real-world
    relationship correctly.
*/

class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    String brand;
    Engine engine; //  Car HAS-A Engine.

    void drive() {

        System.out.println(brand + " is driving");

        engine.start();
    }
}

public class AggregationExample {

    public static void main(String[] args) {

        Engine engine = new Engine();        //  Creating an Engine object.
       
        Car car = new Car();                 // Creating a Car object.

        car.brand = "BMW";

        car.engine = engine;                 //  Giving the Engine object to the Car.

        car.drive();                         // Car uses its Engine.
    }
}