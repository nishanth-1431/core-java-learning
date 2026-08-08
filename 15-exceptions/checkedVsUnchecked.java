/*  Checked vs Unchecked Exceptions

    Definition:

        Java exceptions can be broadly divided into two types:

        1. Checked Exceptions
        2. Unchecked Exceptions

        Checked exceptions are checked by the compiler during
        compilation.

        Unchecked exceptions are not checked by the compiler
        during compilation and usually occur during runtime.

    Checked Exceptions:

        Checked exceptions are exceptions that must be handled
        or declared using the throws keyword.

        Examples:

            IOException
            SQLException
            FileNotFoundException

    Unchecked Exceptions:

        Unchecked exceptions occur during program execution.

        They are subclasses of RuntimeException.

        Examples:

            ArithmeticException
            NullPointerException
            ArrayIndexOutOfBoundsException
            NumberFormatException

    Technical Explanation:

        Checked exceptions are generally used for conditions
        outside the direct control of the program, such as
        file or database operations.

        The compiler forces the programmer to deal with these
        exceptions.

        Unchecked exceptions are generally caused by programming
        mistakes or invalid operations during runtime.

        The compiler does not force the programmer to handle
        them.
*/

public class checkedVsUnchecked {

    public static void main(String[] args) {

        // Unchecked exception
        int number = 10;

        try {

            int result = number / 0;

            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e) {

            System.out.println("Unchecked exception handled");

        }

        System.out.println("Program continues");
    }
}