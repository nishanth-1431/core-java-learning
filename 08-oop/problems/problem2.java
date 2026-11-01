/* 2. Car Information
Create a Car class.
Fields:
- brand
- model
- color

Methods:
- start()
- stop()
Create two Car objects with different values and call both methods.

Topics Used:
- Multiple Objects
- Instance Variables
- Methods
 */
class Car {
    String brand;
    String model;
    String color;
    String start(){
    return " Car is running ";
    }
    String stop(){
        return " Car is stopped ";
    }
}
public class problem2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.brand=" BMW ";
        c2.brand=" Porsche ";
        c1.model=" M1 ";
        c2.model=" 911 ";
        c1.color=" black ";
        c2.color=" white ";
        System.out.println(c1.color+c1.brand+c1.model+ c1.start());
        System.out.println(c1.color+c1.brand+c1.model+ c1.stop());
        System.out.println(c2.color+c2.brand+c2.model+ c2.start());
         System.out.println(c2.color+c2.brand+c2.model+ c2.stop());
    }
}
