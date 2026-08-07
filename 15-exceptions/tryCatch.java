/*  try-catch

    Definition:

        A try-catch block is used to handle exceptions.

        The code that may cause an exception is placed inside
        the try block.

        If an exception occurs, Java immediately stops executing
        the remaining statements inside the try block and
        transfers control to the catch block.

        The catch block handles the exception and prevents the
        program from terminating abnormally.

    Syntax:

        try {

            // Risky code

        }
        catch(ExceptionType object) {

            // Handle the exception

        }

    Technical Explanation:

        The try block contains code that may generate an
        exception.

        If no exception occurs, the catch block is skipped.

        If an exception occurs, Java creates an exception object
        and passes it to the matching catch block.

        After the catch block executes, the program continues
        with the remaining statements after the try-catch block.
*/

public class tryCatch {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int number = 10;
            int result = number / 0;

            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e) {

            System.out.println("Exception Handled");
            System.out.println(e);

        }

        System.out.println("Program Ended");
    }
}

/* Visualize the flow :
  Program Starts
        │
        ▼
  Enter try Block
        │
        ▼
    Exception?_
    │          │
    No        Yes
    │          │
    ▼          ▼
Skip catch  Go to catch
    │          │
    └──────┬───┘
           ▼
    Continue Program
 */