/*
Runnable Interface:

    Runnable is an interface used to define a task that can
    be executed by a thread.

    Instead of extending the Thread class, a class can
    implement the Runnable interface.

Syntax:

    class MyTask implements Runnable {

        public void run() {
            // Task performed by the thread
        }
    }

    MyTask task = new MyTask();

    Thread thread = new Thread(task);

    thread.start();

Example:

    class MyTask implements Runnable {

        public void run() {
            System.out.println("Task is running");
        }
    }

Technical Explanation:

    Runnable represents the task that should be performed.

    Thread represents the thread that executes the task.

    The Runnable object is passed to a Thread object.

    Calling start() on the Thread starts a new thread,
    which then executes the run() method of the Runnable object.

    Runnable → Defines the task
    Thread   → Executes the task
    start()  → Starts the new thread
    run()    → Contains the task

Important:

    Runnable does not create a thread by itself.

    It only defines the task.

    A Thread object is required to execute the Runnable task
    in a separate thread.
*/

class MyTask implements Runnable {

    @Override
    public void run() {

        // Task performed by the thread
        System.out.println("Runnable task is running");
    }
}

public class runnableInterface {

    public static void main(String[] args) {

        // Creating the task
        MyTask task = new MyTask();

        // Creating a thread and giving it the task
        Thread thread = new Thread(task);

        // Starting the new thread
        thread.start();
    }
}