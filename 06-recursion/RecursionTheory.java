/*
    RECURSION :

    Recursion is a programming technique in which a method calls itself to solve a problem. Instead of solving the
    whole problem at once, it keeps breaking the problem into smaller parts until a stopping condition is reached.

    ---------------------------------------------------------
    Basic Syntax
    ---------------------------------------------------------

    returnType methodName(parameters){

        // Base Case
        if(condition){
            return value;
        }

        // Recursive Call
        return methodName(smallerProblem);
    }

    ---------------------------------------------------------
    Base Case
    ---------------------------------------------------------

    The base case is the condition that stops recursion.

    If there is no base case, the method will keep calling
    itself forever and Java will throw a StackOverflowError.

    Example:

        if(n == 0){
            return;
        }

    ---------------------------------------------------------
    Recursive Case
    ---------------------------------------------------------

    The recursive case is the part where the method calls
    itself again with a smaller input.

    Example:

        print(n - 1);

    Every recursive call should move closer to the base case.

    ---------------------------------------------------------
    How Recursion Works
    ---------------------------------------------------------

    Example:

        print(3);

    Execution:

        print(3)
            ↓
        print(2)
            ↓
        print(1)
            ↓
        print(0)

    print(0) reaches the base case and stops.

    Then the methods return one by one.

    ---------------------------------------------------------
    Call Stack
    ---------------------------------------------------------

    Every method call is stored in memory called the Call Stack.

    Example:

        factorial(4)

    Stack:

        factorial(4)
        factorial(3)
        factorial(2)
        factorial(1)

    After factorial(1) finishes, the methods return in the
    reverse order until the stack becomes empty.

    ---------------------------------------------------------
    Advantages
    ---------------------------------------------------------

    • Code becomes shorter for some problems.
    • Easy to understand for tree-like problems.
    • Useful in Backtracking.
    • Used in Divide and Conquer algorithms.
    • Makes some problems easier to solve than loops.

    ---------------------------------------------------------
    Disadvantages
    ---------------------------------------------------------

    • Uses more memory because of the call stack.
    • Can be slower than loops.
    • Missing the base case causes StackOverflowError.
    • Deep recursion may exceed stack memory.

    ---------------------------------------------------------
    Common Applications
    ---------------------------------------------------------

    • Factorial
    • Fibonacci Series
    • Binary Search
    • Tree Traversal
    • Graph DFS
    • Merge Sort
    • Quick Sort
    • Tower of Hanoi
    • Maze Problems
    • N-Queens
    • Sudoku Solver

    ---------------------------------------------------------
    Recursion vs Loop
    ---------------------------------------------------------

    Loop
    ----
    - Uses iteration
    - Faster
    - Uses less memory

    Recursion
    ---------
    - Uses method calls
    - Easier for recursive problems
    - Uses more memory because of the call stack

    ---------------------------------------------------------
    Important Points
    ---------------------------------------------------------

    1. Every recursive method must have a base case.
    2. Each recursive call should reduce the problem.
    3. The recursion must eventually reach the base case.
*/

public class RecursionTheory {

    // Example 1 - Print numbers from 1 to n
    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    // Example 2 - Factorial
    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Example 3 - Fibonacci
    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 5:");
        printNumbers(5);

        System.out.println();

        System.out.println("Factorial of 5 = " + factorial(5));

        System.out.println("Fibonacci of 6 = " + fibonacci(6));
    }
}