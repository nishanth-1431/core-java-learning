/*
    BASE CASE IN RECURSION

    A base case is the condition that stops a recursive method
    from calling itself.

    Every recursive method must have at least one base case.
    Without it, the method will keep calling itself forever,
    eventually causing a StackOverflowError.

    Think of the base case as the stopping point of recursion.

    Example:
    Print numbers from 5 to 1.

    Base Case:
        if(n == 0)
            return;

    Once n becomes 0, the recursion stops.
*/

public class BaseCaseExample {

    static void print(int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        System.out.println(n);

        print(n - 1);
    }

    public static void main(String[] args) {

        print(5);

    }
}