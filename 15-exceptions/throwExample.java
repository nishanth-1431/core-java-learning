/*  throw

    Definition:

        The throw keyword is used to manually throw an exception
        when the programmer decides that a particular situation
        is invalid.

    Syntax:

        throw new ExceptionType("message");

    Technical Explanation:

        throw creates an exception object and immediately transfers
        control to a matching catch block.

        It is commonly used when a program's business rule or
        validation condition is violated.

        Example:

            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above");
            }
*/

public class throwExample {

    public static void main(String[] args) {

        int age = 16;

        try {

            if (age < 18) {

                // Manually throwing an exception
                throw new IllegalArgumentException("Age must be 18 or above");
            }

            System.out.println("User is eligible");

        }
        catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues");
    }
}