/*
    CALL STACK IN RECURSION

    Whenever a method is called, Java stores that method
    inside a memory area called the Call Stack.

    In recursion, every recursive call is pushed onto
    the stack.

    Once the base case is reached, the methods start
    returning one by one.

    Example:

    demo(3)

    Stack becomes:

        demo(3)
        demo(2)
        demo(1)
        demo(0)

    demo(0) reaches the base case.

    Then the methods return in reverse order:

        demo(1)
        demo(2)
        demo(3)

    This process is called Stack Unwinding.
*/

public class CallStackDemo {

    static void demo(int n) {

        if (n == 0) {
            System.out.println("Base Case Reached");
            return;
        }

        System.out.println("Method Called : " + n);

        demo(n - 1);

        System.out.println("Returning From : " + n);

    }

    public static void main(String[] args) {

        demo(3);

    }
}