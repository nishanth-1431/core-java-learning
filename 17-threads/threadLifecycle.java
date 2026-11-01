/*
Thread Lifecycle & Thread States:

    A Java thread passes through 6 lifecycle states managed by JVM and OS scheduler.

Thread States:

    1. NEW: Thread object created but start() not yet invoked.
    2. RUNNABLE: Thread executing or ready for execution in JVM.
    3. BLOCKED: Thread waiting for monitor lock to enter synchronized section.
    4. WAITING: Thread waiting indefinitely for another thread action (wait(), join()).
    5. TIMED_WAITING: Thread waiting for a specified timeout (sleep(), wait(ms), join(ms)).
    6. TERMINATED: Thread completed execution or exited due to exception.

Syntax:

    Thread.State state = thread.getState();

Technical Explanation:

    Transitions:
    NEW ──start()──> RUNNABLE ──(sleep/wait)──> TIMED_WAITING / WAITING
                        │                            │
                        └───(run finishes)───────────┴──> TERMINATED

Important:

    Once a thread reaches TERMINATED state, calling start() again throws IllegalThreadStateException.
*/

public class threadLifecycle {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        });

        System.out.println("State after instantiation: " + thread.getState()); // NEW

        thread.start();
        System.out.println("State after start(): " + thread.getState()); // RUNNABLE

        Thread.sleep(100);
        System.out.println("State during sleep(): " + thread.getState()); // TIMED_WAITING

        thread.join();
        System.out.println("State after completion: " + thread.getState()); // TERMINATED
    }
}
