public class operators {
    public static void main(String[] args){
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));          // 15
        System.out.println("Subtraction: " + (a - b));       // 5
        System.out.println("Multiplication: " + (a * b));    // 50
        System.out.println("Division: " + (a / b));          // 2
        System.out.println("Modulus: " + (a % b));           // 0

        // Comparison Operators
        System.out.println("Equal to: " + (a == b));                 // false
        System.out.println("Not equal to: " + (a != b));             // true
        System.out.println("Greater than: " + (a > b));              // true
        System.out.println("Less than: " + (a < b));                 // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b));    // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));     // false
        System.out.println("Logical OR: " + (x || y));      // true
        System.out.println("Logical NOT: " + (!x));         // false

        // Assignment Operators

        int c = a;              // Assignment

        c += 5;                                                  // Addition assignment (c = c + 5)
        System.out.println("Addition Assignment: " + c);         // 15
        
        c -= 3;                                                  // Subtraction assignment (c = c - 3)
        System.out.println("Subtraction Assignment: " + c);      // 12

        c *= 2;                                                  // Multiplication assignment (c = c * 2)
        System.out.println("Multiplication Assignment: " + c);   // 24

        c /= 4;                                                  // Division assignment (c = c / 4)
        System.out.println("Division Assignment: " + c);         // 6

        c %= 4;                                                  // Modulus assignment (c = c % 4)
        System.out.println("Modulus Assignment: " + c);          // 2

    }
}
