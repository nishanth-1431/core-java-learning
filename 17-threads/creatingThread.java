/*
Creating a Thread:

    A thread can be created in Java by using the Thread class.

    The Thread class provides methods that allow us to create
    and control a thread.

    To create a thread using the Thread class, we can extend
    the Thread class and override its run() method.

Syntax:

    class MyThread extends Thread {

        public void run() {
            // Task performed by the thread
        }
    }

    MyThread thread = new MyThread();
    thread.start();

Example:

    class MyThread extends Thread {

        public void run() {
            System.out.println("Child thread is running");
        }
    }

    MyThread thread = new MyThread();
    thread.start();

Technical Explanation:

    The run() method contains the task that the thread should
    perform.

    The start() method starts a new thread.

    When start() is called, Java creates a new thread and
    executes the run() method inside that thread.

    start() → Creates and starts a new thread
    run()   → Contains the task performed by the thread

Important:

    Calling run() directly does not create a new thread.

    thread.run() behaves like a normal method call.
*/

class MyThread extends Thread {

    // Task that will be performed by the new thread
    @Override
    public void run() {
        System.out.println("Child thread is running");
    }
}

public class creatingThread {

    public static void main(String[] args) {

        // This code is running inside the main thread
        System.out.println("Main thread is running");

        // Creating an object of MyThread
        MyThread thread = new MyThread();

        // Starting the new thread
        thread.start();
        System.out.println("Main thread continues");
    }
}