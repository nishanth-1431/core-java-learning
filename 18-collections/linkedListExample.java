/*
LinkedList:

    LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
    It stores elements as nodes containing data and links to the previous and next nodes.

Core Methods:

    1. addFirst(E e): Inserts the specified element at the beginning.
    2. addLast(E e): Appends the specified element to the end.
    3. removeFirst(): Removes and returns the first element.
    4. removeLast(): Removes and returns the last element.

Syntax:

    LinkedList<String> list = new LinkedList<>();
    list.addFirst("Start");
    list.addLast("End");

Technical Explanation:

    • Memory is allocated per node, so it avoids array resizing overhead.
    • Fast for insertions and deletions at the ends or if you have a node reference.
    • Slower for random access since you have to traverse the list from the ends.

Important:

    Takes up more memory than ArrayList due to storing pointers for previous and next nodes.
*/
import java.util.LinkedList;

public class linkedListExample {
    public static void main(String[] args) {
        System.out.println("--- LinkedList Example ---");
        // ordered list, efficient for adding/removing from middle
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        
        tasks.addFirst("Urgent Task");
        tasks.addLast("Final Task");

        System.out.println("Tasks: " + tasks);
        tasks.removeFirst();
        System.out.println("After removing first: " + tasks);
    }
}
