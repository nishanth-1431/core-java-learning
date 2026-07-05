/* 1. Compile-time Polymorphism :
      - Definition
        When the method call is decided during compilation, it is called Compile-time Polymorphism.
      - Achieved By
        Method Overloading
      - Key Point
        Same method name but different parameters.
    
    What is Method Overloading?
        - Definition
            If multiple methods have:
            Same method name Different parameters then it is called Method Overloading.

        - Rules
            Methods can differ by:
                Number of parameters,
                Type of parameters,
                Order of parameters.


 */
class Calculator {

    // This method is used when we pass 2 integer values
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // This method is used when we pass 3 integer values
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // This method is used when we pass 2 decimal values
    void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class compile_time {

    public static void main(String[] args) {

        // Creating an object of Calculator
        Calculator obj = new Calculator();

        // Java sees 2 int values, so it calls add(int, int)
        obj.add(10, 20);

        // Java sees 3 int values, so it calls add(int, int, int)
        obj.add(10, 20, 30);

        // Java sees 2 double values, so it calls add(double, double)
        obj.add(5.5, 2.5);
    }
}
/*
Real Time Example:
  Mobile Recharge
  Same recharge option behaves differently.
  Recharge:
  ₹199 → 28 days
  ₹399 → 56 days
  ₹699 → 84 days
  Same recharge name → Different behavior.
  Programming Example
  print() print("Hello") print(100)
  Same method name → Different inputs.
   */



