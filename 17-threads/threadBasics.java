/*
Thread Basics:

    A thread is a lightweight, independent path of execution inside a program.
    A Java program can contain multiple threads running concurrently to perform
    different tasks simultaneously, improving performance and responsiveness.

Main Thread:

    When a Java application starts, the JVM automatically creates a primary thread
    called the "main thread".
    
    The main() method executes inside the main thread.

Syntax:

    // Get current executing thread object
    Thread currentThread = Thread.currentThread();

    // Get name of the thread
    String threadName = currentThread.getName();

Technical Explanation:

    • Thread.currentThread() returns the reference of the thread currently executing.
    • getName() returns the string name assigned to the thread.

    Thread.currentThread().getName()
             ↓
    Current Thread Reference
             ↓
       "main" Thread Name

Important:

    Even a simple Java program with just main() is single-threaded, running inside the main thread created by the JVM.
*/

public class threadBasics {

    public static void main(String[] args) {

        // Accessing the main thread
        Thread currentThread = Thread.currentThread();

        // Retrieving name of the current thread
        String threadName = currentThread.getName();

        System.out.println("Current Thread Name: " + threadName);
    }
}