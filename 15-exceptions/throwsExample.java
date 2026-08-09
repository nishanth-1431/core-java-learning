/*  throws Definition:

        The throws keyword is used in a method declaration to
        indicate that the method may throw one or more exceptions.

        It does not actually throw the exception by itself.

        It tells the code calling the method that the exception
        may need to be handled.

    Syntax:

        returnType methodName() throws ExceptionType {
            // code
        }

    Technical Explanation:

        When a method declares an exception using throws, the
        responsibility of handling that exception can be passed
        to the code that calls the method.

        The caller can either handle the exception using try-catch
        or declare the exception again using throws.

    Difference:

        throw:
            Actually throws an exception.

        throws:
            Declares that a method may throw an exception.
*/

public class throwsExample {

    static void checkAge(int age) throws Exception {

        if (age < 18) {

            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {

            checkAge(16);

        }
        catch (Exception e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Program continues");
    }
}