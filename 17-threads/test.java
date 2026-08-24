/*
Thread Priority & Sleep:

    1. Thread Priority:
       • Every thread in Java has a priority that hints to the thread scheduler
         the importance of the thread.
       • Priority values range from 1 (lowest) to 10 (highest).
       • Default priority is 5 (Thread.NORM_PRIORITY).

    Priority Constants:
       • Thread.MIN_PRIORITY  = 1
       • Thread.NORM_PRIORITY = 5
       • Thread.MAX_PRIORITY  = 10

    2. Thread Sleep:
       • Thread.sleep(milliseconds) pauses the execution of the current thread
         for the specified duration.
       • Throws checked InterruptedException.

Syntax:

    thread.setPriority(Thread.MAX_PRIORITY); // Priority 10
    int priority = thread.getPriority();

    Thread.sleep(1000); // Sleep for 1000ms (1 second)

Technical Explanation:

    • High priority hints to the OS scheduler to prefer executing that thread,
      though actual behavior depends on underlying operating system thread scheduling.
    • Thread.sleep() puts thread in TIMED_WAITING state without releasing object locks.

Important:

    Thread priorities are suggestions to the OS, not strict guarantees. Never rely on priorities for algorithm correctness.
*/

class PriorityWorker extends Thread {
    @Override
    public void run() {
   for(int i =0 ; i<=5;i++){
    System.out.println("Sandy");
    try {
            Thread.sleep(500); // Sleep for 500ms
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
  }
    }
}
class Pr extends Thread {
    @Override
    public void run() {
   for(int i =0 ; i<=5;i++){
    System.out.println("Nish");
    try {
            Thread.sleep(500); // Sleep for 500ms
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
  }
    }
}

public class test {

    public static void main(String[] args) throws InterruptedException {

        PriorityWorker lowPriorityThread = new PriorityWorker();
        Pr highPriorityThread = new Pr();

        // Setting priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Priority 1
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting threads
        lowPriorityThread.start();
        highPriorityThread.start();
    }
} 
    

