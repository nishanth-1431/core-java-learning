
/*1.AI Assistant — Parallel Response Generation
An AI assistant receives a user request and needs to perform multiple background tasks simultaneously.
Create a program where separate threads handle:
•	Generating the response
•	Fetching user preferences
•	Preparing conversation history
•	Calculating response time
Requirements:
•	Create threads using the Thread class.
•	Display the name of each thread.
•	Observe how the tasks execute concurrently.
•	Identify the main thread and worker threads.
Concepts:
•	Thread basics
•	Main thread
•	Thread class
•	start()
•	run()
 */
// Thread 1: Handles generating the response
class ResponseGenerator extends Thread {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Action: Generating the core AI response...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } // Simulating workload
        System.out.println("[" + Thread.currentThread().getName() + "] Status: Core response generation complete.");
    }
}

// Thread 2: Handles fetching user preferences
class PreferenceFetcher extends Thread {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Action: Fetching personalized user preferences...");
        try { Thread.sleep(400); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("[" + Thread.currentThread().getName() + "] Status: User preferences fetched successfully.");
    }
}

// Thread 3: Handles preparing conversation history
class HistoryPreparer extends Thread {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Action: Loading prior conversation context and history...");
        try { Thread.sleep(600); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("[" + Thread.currentThread().getName() + "] Status: Conversation history loaded.");
    }
}

// Thread 4: Handles calculating system response time
class ResponseTimeCalculator extends Thread {
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] Action: Initializing performance metrics and timers...");
        try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("[" + Thread.currentThread().getName() + "] Status: Total response metric calculation finalized.");
    }
}

// Main execution class
public class problem1 {
    public static void main(String[] args) {
        // Identify and print the Main Thread
        Thread mainThread = Thread.currentThread();
        System.out.println(" STARTING ENGINE ");
        System.out.println("Main Thread Identity: " + mainThread.getName());

        // Instantiating our worker threads
        ResponseGenerator genThread = new ResponseGenerator();
        PreferenceFetcher fetchThread = new PreferenceFetcher();
        HistoryPreparer historyThread = new HistoryPreparer();
        ResponseTimeCalculator metricThread = new ResponseTimeCalculator();

        // Assign explicit naming conventions for clear output observation
        genThread.setName("GenThread-1");
        fetchThread.setName("FetchThread-2");
        historyThread.setName("HistoryThread-3");
        metricThread.setName("MetricsThread-4");

        // Activating threads concurrently
        // Note: start() schedules execution; run() executes synchronous logic on the current thread.
        genThread.start();
        fetchThread.start();
        historyThread.start();
        metricThread.start();

        System.out.println("\n[" + mainThread.getName() + "] Info: All background system routines have been initialized concurrently.\n");
    }
}
