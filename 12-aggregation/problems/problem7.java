/* 7. Uber-like Application — Driver & Car
      A Driver has a Car.
•	Create Driver and Car. 
•	The car should exist independently of the driver. 
•	A driver can change cars. 
•	A car can later be assigned to another driver. 
•	Display current driver and car details. 
 */
class Car {

    String carModel;
    String carNumber;

    void displayCar() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Number: " + carNumber);
    }
}

class Driver {

    String driverName;
    Car car; // Driver HAS-A Car

    void changeCar(Car newCar) {
        car = newCar;
    }

    void displayDriver() {
        System.out.println("Driver: " + driverName);
        car.displayCar();
        System.out.println();
    }
}

public class problem7 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.carModel = "Toyota";
        car1.carNumber = "TN38AB1234";

        Car car2 = new Car();
        car2.carModel = "Hyundai";
        car2.carNumber = "TN37CD5678";

        Driver driver1 = new Driver();
        driver1.driverName = "Arun";

        // Assign car1 to driver1
        driver1.car = car1;

        driver1.displayDriver();

        // Driver changes to car2
        driver1.changeCar(car2);

        driver1.displayDriver();

        // car1 can be assigned to another driver
        Driver driver2 = new Driver();
        driver2.driverName = "Kumar";
        driver2.car = car1;

        driver2.displayDriver();
    }
    }

