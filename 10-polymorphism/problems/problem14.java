/*Problem 14 – Smart Home Devices (Runtime Polymorphism)
Create a parent class Device with a method turnOn(). Create child classes Light, Fan, AirConditioner, and Television that override the method. Store the objects in an array of Device and invoke the overridden methods.
 */
class Device {

    void turnOn() {
        System.out.println("Device is turned on.");
    }
}

class Light extends Device {

    @Override
    void turnOn() {
        System.out.println("Light is turned on.");
    }
}

class Fan extends Device {

    @Override
    void turnOn() {
        System.out.println("Fan is turned on.");
    }
}

class AirConditioner extends Device {

    @Override
    void turnOn() {
        System.out.println("Air Conditioner is turned on.");
    }
}

class Television extends Device {

    @Override
    void turnOn() {
        System.out.println("Television is turned on.");
    }
}

public class problem14 {

    public static void main(String[] args) {

        // Upcasting
        Device[] devices = {
            new Light(),
            new Fan(),
            new AirConditioner(),
            new Television()
        };

        // Runtime Polymorphism (Dynamic Method Dispatch)
        for (Device device : devices) {
            device.turnOn();
        }
    }
}
