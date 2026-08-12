/*
Thread Definition:

    A thread is a lightweight, independent path of execution
    inside a program.

    A Java program can contain multiple threads, allowing
    different tasks to execute concurrently.

Main Thread:

    When a Java program starts, the JVM automatically creates
    a thread called the main thread.

    The main() method executes inside the main thread.

Syntax:

    Thread.currentThread();

    This returns the currently executing thread.

    Thread.currentThread().getName();

    This returns the name of the currently executing thread.

Example:

    System.out.println(Thread.currentThread().getName());

Output:

    main

Technical Explanation:

    Thread.currentThread() returns the Thread object representing
    the thread that is currently executing the code.

    getName() returns the name assigned to that thread.

    Therefore:

    Thread.currentThread().getName()
            ↓
    Current Thread
            ↓
    Thread Name
*/

public class threadBasics {

    public static void main(String[] args) {

        // Getting the currently executing thread
        Thread currentThread = Thread.currentThread();

        // Getting the name of the current thread
        String threadName = currentThread.getName();

        System.out.println("Current Thread: " + threadName);
    }
}