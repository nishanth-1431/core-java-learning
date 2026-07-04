/*
    RECURSIVE CASE

    The recursive case is the part where the method calls
    itself again.

    Each recursive call should solve a smaller version of
    the original problem.

    If the problem is not reduced, recursion will never
    reach the base case.

    Example:

    print(5)

    ↓

    print(4)

    ↓

    print(3)

    ↓

    print(2)

    ↓

    print(1)

    ↓

    print(0)

    Base Case reached.
*/

public class RecursiveCaseExample {

    static void print(int n) {

        if (n == 0) {
            return;
        }

        System.out.println("Current Value : " + n);

        // Recursive Case
        print(n - 1);
    }

    public static void main(String[] args) {

        print(5);

    }
}