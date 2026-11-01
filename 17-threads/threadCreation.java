/*
Thread Creation & Multiple Threads:

    In Java, creating a thread can be done by extending the Thread class
    and overriding its run() method.

    Multiple threads allow multiple tasks to execute concurrently alongside the main thread.

Syntax:

    class MyThread extends Thread {
        @Override
        public void run() {
            // Task code executed in new thread
        }
    }

    MyThread thread = new MyThread();
    thread.start();

Technical Explanation:

    • run() contains the code for the task the thread performs.
    • start() creates a new call stack and executes run() asynchronously in a separate thread.
    • Concurrent execution flow:
        Main Thread  ──> thread1.start() ──> [Executes Task A]
                     └──> thread2.start() ──> [Executes Task B]

Important:

    Calling thread.run() directly behaves like a normal method call in the current thread.
    Always call thread.start() to launch a new concurrent thread of execution.
*/

class TaskA extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task A - Count: " + i);
        }
    }
}

class TaskB extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task B - Count: " + i);
        }
    }
}

public class threadCreation {

    public static void main(String[] args) {

        System.out.println("Main Thread Started");

        TaskA thread1 = new TaskA();
        TaskB thread2 = new TaskB();

        // Starting multiple threads
        thread1.start();
        thread2.start();

        System.out.println("Main Thread Ended");
    }
}
