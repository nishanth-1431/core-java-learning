/*10. Rectangle
Create a Rectangle class.
Fields:
- length
- breadth
Methods:
- area()
- perimeter()
Display both the area and perimeter.
Topics Used:
- Methods
- Fields
 */
class Rectangle {

    // Fields
    double length;
    double breadth;

    // Method to calculate area
    double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class problem10 {
    public static void main(String[] args) {

        // Creating Rectangle object
        Rectangle rect = new Rectangle();

        // Assigning values
        rect.length = 12;
        rect.breadth = 8;

        // Displaying details
        System.out.println("Length : " + rect.length);
        System.out.println("Breadth : " + rect.breadth);
        System.out.println("Area : " + rect.area());
        System.out.println("Perimeter : " + rect.perimeter());
    }
}
