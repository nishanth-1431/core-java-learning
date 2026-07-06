/* Problem 1 – Calculator (Method Overloading)
Create a Calculator class and overload the add() method to perform addition for:
•	Two integers
•	Three integers
•	Two double values
*/
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class problem1 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of two double values: " + calc.add(10.5, 20.8));
    }
}
