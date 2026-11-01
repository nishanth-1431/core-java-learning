/*  Nested try Blocks

    Definition:

        A nested try block is a try block placed inside another
        try block.

        The inner try block can handle its own exception.
        If the inner try block does not handle an exception,
        Java can pass the exception to the outer catch block.

    Syntax:

        try {

            try {

                // Inner risky code

            }
            catch (ExceptionType e) {

                // Handle inner exception

            }

        }
        catch (ExceptionType e) {

            // Handle outer exception

        }

    Technical Explanation:

        Java first looks for a matching catch block belonging
        to the innermost try block where the exception occurred.

        If no matching catch block is found there, the exception
        can propagate to the outer try-catch structure.

        Nested try blocks are useful when different sections of
        a larger operation require separate exception handling.
*/
public class nestedTry {

    public static void main(String[] args) {

        try {

            System.out.println("Outer try started");

            try {

                int[] numbers = {10, 20, 30};

                System.out.println(numbers[5]);   // Exception

            }
            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Inner catch: Arithmetic error");

            }

            System.out.println("Outer try continues");

            int result = 10 / 0;   // Exception

            System.out.println(result);

        }
        catch (ArithmeticException e) {

            System.out.println("Outer catch: Cannot divide by zero");

        }

        System.out.println("Program continues");
    }
}