/*  Multiple Catch Blocks

    Definition:

        Multiple catch blocks allow us to handle different types
        of exceptions separately for a single try block.

        A try block can contain code that may cause different
        exceptions.

        Each catch block handles a specific type of exception.

    Syntax:

        try {

            // Code that may cause different exceptions

        }
        catch (ExceptionType1 e) {

            // Handle ExceptionType1

        }
        catch (ExceptionType2 e) {

            // Handle ExceptionType2

        }

    Technical Explanation:

        When an exception occurs inside the try block, Java
        checks the catch blocks from top to bottom.

        Java selects the first catch block whose exception type
        matches the exception that occurred.

        Once a matching catch block is found, that catch block
        executes and the remaining catch blocks are skipped.

        More specific exception types should be placed before
        more general exception types.
*/

public class multipleCatch {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            int result = 10 / 0;

            System.out.println(result);

            System.out.println(numbers[2]);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index.");

        }

        System.out.println("Program continues.");
    }
}