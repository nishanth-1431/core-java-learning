/*
Runnable Interface vs Thread Class:

    Runnable is a functional interface in Java used to define a task that can be executed
    by a thread.

Why Preferred over extending Thread?

    1. Multiple Inheritance Support:
       Java does not support multiple class inheritance. If a class extends Thread,
       it cannot extend any other class. Implementing Runnable keeps class hierarchy flexible.

    2. Separation of Tasks & Mechanics:
       Runnable represents the task to perform, while Thread handles thread execution.

    3. Lambda Expressions:
       Since Runnable is a functional interface, it can be implemented concisely using Lambdas.

Syntax:

    // 1. Implementing Runnable interface
    class MyTask implements Runnable {
        public void run() { ... }
    }
    Thread t1 = new Thread(new MyTask());

    // 2. Using Lambda Expression
    Runnable task = () -> System.out.println("Running task");
    Thread t2 = new Thread(task);

Technical Explanation:

    Runnable  ──(Task Definition)──> Thread(runnable) ──> start() ──> Executed in parallel

Important:

    Runnable does not start a new thread by itself. A Thread instance is needed to execute the Runnable task.
*/

class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("CustomRunnable executing via Thread: " + Thread.currentThread().getName());
    }
}

public class runnableInterface {

    public static void main(String[] args) {

        // Approach 1: Class implementing Runnable
        CustomRunnable myTask = new CustomRunnable();
        Thread thread1 = new Thread(myTask, "RunnableThread-1");
        thread1.start();

        // Approach 2: Lambda Expression for Runnable
        Runnable lambdaTask = () -> {
            System.out.println("Lambda task executing via Thread: " + Thread.currentThread().getName());
        };

        Thread thread2 = new Thread(lambdaTask, "LambdaThread-2");
        thread2.start();
    }
}