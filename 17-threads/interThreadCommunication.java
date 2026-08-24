/*
Inter-Thread Communication:

    Inter-thread communication allows synchronized threads to communicate
    and coordinate execution using wait(), notify(), and notifyAll() methods from java.lang.Object.

Core Methods:

    1. wait(): Releases monitor lock and suspends thread execution until signaled.
    2. notify(): Wakes up a single thread waiting on the object's monitor lock.
    3. notifyAll(): Wakes up all threads waiting on the object's monitor lock.

Syntax:

    synchronized (lockObject) {
        while (!condition) {
            lockObject.wait(); // Pause & release lock
        }
        // Action
        lockObject.notify(); // Signal waiting thread
    }

Technical Explanation:

    • Coordination avoids busy-waiting polling loops.
    • Must be called inside synchronized context (otherwise throws IllegalMonitorStateException).

Important:

    Always invoke wait() inside a while loop to handle spurious wakeups safely.
*/

class DataBuffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int val) throws InterruptedException {
        while (available) {
            wait();
        }
        this.data = val;
        this.available = true;
        System.out.println("Produced: " + val);
        notifyAll(); // Signal waiting consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        this.available = false;
        notifyAll(); // Signal waiting producer
    }
}

public class interThreadCommunication {

    public static void main(String[] args) {

        DataBuffer buffer = new DataBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    buffer.produce(i);
                    Thread.sleep(200);
                }
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    buffer.consume();
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        });

        producer.start();
        consumer.start();
    }
}
