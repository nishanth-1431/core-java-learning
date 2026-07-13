/*8. Circle
Create a Circle class.
Field:
- radius
Methods:
- area()
- circumference()
Create two Circle objects with different radii and display their area and circumference.
Topics Used:
- Object Methods
- Instance Variables
 */
class Circle {

    // Field
    double radius;

    // Method to calculate area
    double area() {
        return 3.14 * radius * radius;
    }

    // Method to calculate circumference
    double circumference() {
        return 2 * 3.14 * radius;
    }
}

public class problem8 {
    public static void main(String[] args) {

        // Creating first Circle object
        Circle c1 = new Circle();
        c1.radius = 5;

        // Creating second Circle object
        Circle c2 = new Circle();
        c2.radius = 10;

        // Display details of first circle
        System.out.println("Circle 1");
        System.out.println("Radius : " + c1.radius);
        System.out.println("Area : " + c1.area());
        System.out.println("Circumference : " + c1.circumference());

        // Display details of second circle
        System.out.println("\nCircle 2");
        System.out.println("Radius : " + c2.radius);
        System.out.println("Area : " + c2.area());
        System.out.println("Circumference : " + c2.circumference());
    }
}
