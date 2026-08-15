/*
Thread Class:

    Thread is a built-in Java class used to create and manage
    threads.

    By extending the Thread class, a custom class can become
    a thread.

Syntax:

    class MyThread extends Thread {

        public void run() {
            // Task performed by the thread
        }
    }

    MyThread thread = new MyThread();
    thread.start();

Important Methods:
 
    start()
        Starts a new thread and causes the run() method to
        execute in that new thread.

    run()
        Contains the task that the thread performs.

    setName()
        Assigns a name to a thread.

    getName()
        Returns the name of a thread.

Technical Explanation:

    The Thread class provides the functionality required to
    create and control threads.

    When a class extends Thread, its object can be started
    as a thread using the start() method.

    start() → Starts a new thread
    run()   → Contains the thread's task
    setName() → Sets the thread's name
    getName() → Gets the thread's name
*/

class MyThread extends Thread {

    @Override
    public void run() {

        // Getting the name of the current thread
        System.out.println("Running Thread: " + getName());
    }
}

public class threadClass {

    public static void main(String[] args) {

        // Creating the first thread
        MyThread thread1 = new MyThread();

        // Giving the thread a custom name
        thread1.setName("First Thread");

        // Starting the first thread
        thread1.start();

        // Creating the second thread
        MyThread thread2 = new MyThread();

        // Giving the second thread a custom name
        thread2.setName("Second Thread");

        // Starting the second thread
        thread2.start();
    }
}