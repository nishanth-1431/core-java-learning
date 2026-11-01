/*
ArrayList:

    ArrayList is a resizable array implementation of the List interface. 
    It maintains insertion order and allows duplicate elements.

Core Methods:

    1. add(E e): Appends the specified element to the end of the list.
    2. get(int index): Returns the element at the specified position.
    3. remove(int index): Removes the element at the specified position.
    4. size(): Returns the number of elements in the list.

Syntax:

    List<String> list = new ArrayList<>();
    list.add("Apple");
    String item = list.get(0);

Technical Explanation:

    • Backed by an array that dynamically grows when it gets full.
    • Fast for random access (get/set) operations.
    • Slower for insertions/deletions in the middle, as elements must shift.

Important:

    Not thread-safe. For concurrent access, use Collections.synchronizedList or CopyOnWriteArrayList.
*/
import java.util.ArrayList;
import java.util.List;

public class arrayListExample {
    public static void main(String[] args) {
        System.out.println("--- ArrayList Example ---");
        // ordered list, allows duplicates, fast access by index
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate allowed

        System.out.println("Fruits: " + fruits);
        System.out.println("Fruit at index 1: " + fruits.get(1));
    }
}
