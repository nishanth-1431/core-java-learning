/*  Exception Basics

    Definition:

        An exception is an unexpected event that occurs during
        the execution of a program.

        It interrupts the normal flow of the program.

        If an exception is not handled, the program terminates
        abnormally.

    Why Exceptions Happen:

        Exceptions occur when the program performs an invalid
        operation during execution.

        Examples:

            • Dividing a number by zero.
            • Accessing an invalid array index.
            • Converting an invalid String to a number.
            • Trying to open a file that does not exist.

    Syntax:

        // Exceptions are handled using try-catch blocks.
        // (Covered in the next topic)

        try {
            // Risky code
        }
        catch(Exception e) {
            // Handle the exception
        }

    Technical Explanation:

        When an exception occurs, Java creates an Exception
        object.

        If the exception is not handled, Java stops executing
        the program and displays an error message called the
        stack trace.

        Exception handling allows the program to recover from
        errors instead of terminating immediately.
*/

public class exceptionBasics {

    public static void main(String[] args) {

        System.out.println("Program Started");

        int number = 10;
        int result = number / 0;    // Exception occurs here

        System.out.println("Result: " + result);

        System.out.println("Program Ended");
    }
}