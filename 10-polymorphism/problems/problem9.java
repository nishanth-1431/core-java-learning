/* Problem 9 – Shape Drawing (Method Overriding)
Create a parent class Shape with a method draw(). Create child classes Circle,
Rectangle, and Triangle that override the draw() method.
*/
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

public class problem9 {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}
