/*Problem 4 - Shape Area
Create an abstract class Shape.
•	Create an abstract method calculateArea(). 
•	Create Circle and Rectangle. 
•	Calculate and display their areas. 
 */
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    @Override
    double calculateArea() {
        double radius = 5;
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    @Override
    double calculateArea() {
        double length = 10;
        double width = 5;

        return length * width;
    }
}

public class problem4 {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("Circle Area : " + circle.calculateArea());
        System.out.println("Rectangle Area : " + rectangle.calculateArea());
    }
}
