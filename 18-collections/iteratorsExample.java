/*
Iterators:

    An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    It provides a safe way to remove elements while iterating.

Core Methods:

    1. hasNext(): Returns true if the iteration has more elements.
    2. next(): Returns the next element in the iteration.
    3. remove(): Removes the last element returned by this iterator from the underlying collection.

Syntax:

    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
        String item = it.next();
        if (item.equals("RemoveMe")) {
            it.remove();
        }
    }

Technical Explanation:

    • Standard way to traverse collections in Java before the enhanced for-loop and Streams.
    • Calling collection.remove() directly while iterating usually throws a ConcurrentModificationException. 
    • Iterator's remove() method is safe from this exception.

Important:

    You can only call remove() once per call to next().
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorsExample {
    public static void main(String[] args) {
        System.out.println("--- Iterators Example ---");
        // way to loop through any collection
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Number: " + number);
            if (number == 20) {
                iterator.remove(); // Safely remove while iterating
            }
        }
        System.out.println("List after removal: " + numbers);
    }
}
