/*  Custom Exceptions

    Definition:

        A custom exception is an exception created by the
        programmer for a specific situation in an application.

        Java already provides built-in exceptions such as
        ArithmeticException and NullPointerException.

        However, real applications often have their own rules
        and require meaningful exception types.

    Syntax:

        class CustomException extends Exception {

            CustomException(String message) {
                super(message);
            }
        }

    Technical Explanation:

        A custom exception is created by extending the Exception
        class or one of its subclasses.

        The constructor receives an error message and passes it
        to the parent Exception class using super().

        The custom exception can then be thrown using throw.

        The exception can be handled using try-catch.

    Example:

        class InsufficientBalanceException extends Exception {

            InsufficientBalanceException(String message) {
                super(message);
            }
        }

        throw new InsufficientBalanceException("Insufficient balance");
*/

class InsufficientBalanceException extends Exception {

    // Constructor of the custom exception
    InsufficientBalanceException(String message) {

        // Pass the message to the Exception class
        super(message);
    }
}

public class customException {

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawAmount = 7000;

        try {

            if (withdrawAmount > balance) {

                // Manually throwing our custom exception
                throw new InsufficientBalanceException(
                    "Insufficient balance"
                );
            }

            balance = balance - withdrawAmount;

            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);

        }
        catch (InsufficientBalanceException e) {

            // Getting the message from the exception object
            System.out.println("Transaction failed");
            System.out.println("Reason: " + e.getMessage());
        }

        System.out.println("Program continues");
    }
}