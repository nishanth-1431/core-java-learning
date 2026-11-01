/*Problem 1 - Abstract Class
Create an abstract class Vehicle.
•	Create an abstract method startEngine(). 
•	Create a normal method stopEngine(). 
•	Create a class Car that extends Vehicle. 
•	Implement the abstract method. 
•	Call both methods in main(). 
 */
abstract class Vehicle{
    abstract void startEngine();
    void stopEngine(){
        System.out.println("Stopped..!!!");
    }
}
class Car extends Vehicle{
     @Override
     void startEngine(){
        System.out.println("Car is started");
     }
     void stopEngine(){
        System.out.println("car is stopped");
     }
}
public class problem1 {
    public static void main(String[] args){
    Vehicle v = new Car();
    v.startEngine();
    v.stopEngine();
    }
}
