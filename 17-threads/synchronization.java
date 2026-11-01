/*
Race Condition & Synchronization:

    1. Race Condition:
       Occurs when multiple threads concurrently read/write shared mutable data without proper coordination.
       The final outcome becomes non-deterministic and leads to data corruption.

    2. Synchronization:
       Mechanism that enforces mutual exclusion so that only one thread can execute a critical section
       at any given time using object intrinsic locks (monitors).

Synchronization Forms:

    1. Synchronized Method:
       Locks the entire instance ('this') or class ('ClassName.class').
       Syntax: public synchronized void increment() { ... }

    2. Synchronized Block:
       Locks only a specific section of code on a designated lock object for better performance.
       Syntax: synchronized(lockObject) { ... }

Technical Explanation:

    • Operation count++ is non-atomic (Read -> Modify -> Write).
    • Synchronization acquires monitor lock before entering critical section and releases it on exit.
    • CRITICAL RULE: All threads MUST synchronize on the exact SAME lock object. Using different locks
      allows concurrent execution and still causes race conditions.

Important:

    Always synchronize shared mutable state using a single consistent lock object across all accessing threads.
*/

class SafeCounter {
    private int count = 0;

    // Synchronized instance method - locks 'this' instance
    public synchronized void increment() {
        count++; // Thread-safe execution
    }

    public synchronized int getCount() {
        return count;
    }
}

public class synchronization {

    public static void main(String[] args) throws InterruptedException {

        SafeCounter counter = new SafeCounter();

        // Thread 1 increments 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2 increments 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Guaranteed result: 2000
        System.out.println("Final Counter Value (Safely Synchronized): " + counter.getCount());
    }
}
