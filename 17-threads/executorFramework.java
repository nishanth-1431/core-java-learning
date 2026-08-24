/*
Executor Framework & ExecutorService:

    Introduced in Java 5 (java.util.concurrent), the Executor Framework decouples
    task submission from thread creation and execution mechanics using thread pools.

Why Use Executor Framework?

    1. Thread Reuse: Reuses worker threads to process tasks instead of creating/destroying threads repeatedly.
    2. Managed Concurrency: Prevents resource exhaustion by capping max active threads in a pool.
    3. Lifecycle Management: Offers methods to cleanly manage task lifecycle and pool shutdown.

Core Components:

    • Executor: Root interface for task execution.
    • ExecutorService: Subinterface providing shutdown & future tracking features.
    • Executors: Factory class providing creation methods like newFixedThreadPool().

Syntax:

    ExecutorService pool = Executors.newFixedThreadPool(3);
    pool.execute(() -> System.out.println("Task running"));
    pool.shutdown();

Technical Explanation:

    Task Submitted ──> Task Queue ──> [ Fixed Worker Thread Pool ] ──> Processed Task

Important:

    Always call shutdown() when finished to allow worker threads to exit cleanly and permit JVM termination.
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorFramework {

    public static void main(String[] args) {

        // Creating a thread pool of 2 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submitting 4 tasks to the thread pool
        for (int i = 1; i <= 4; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName());
            });
        }

        // Gracefully shutting down the executor service
        executor.shutdown();
        System.out.println("Executor pool shutdown initiated.");
    }
}
