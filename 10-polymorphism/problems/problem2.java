

/* Problem 2 – Area Calculator (Method Overloading)
Create an Area class and overload the calculateArea() method to calculate the area of:
•	A square
•	A rectangle
•	A circle
 */
class Area{
    double calculateArea(int a){
        return a*a;
    }
    double calculateArea(double l , double w){
        return l*w;
    }
    double calculateArea(double r){
        double pi = 3.14;
        return pi *(r*r);
    }
}

public class problem2 {
     public static void main(String[] args) {

        Area obj = new Area();

        System.out.println("Area of Square = " + obj.calculateArea(5));
        System.out.println("Area of Rectangle = " + obj.calculateArea(5.0, 4.0));
        System.out.println("Area of Circle = " + obj.calculateArea(7.0));

    }
}
