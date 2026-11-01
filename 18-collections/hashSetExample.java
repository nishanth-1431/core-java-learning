/*
HashSet:

    HashSet is a collection that uses a hash table for storage. 
    It implements the Set interface and does not allow duplicate values.

Core Methods:

    1. add(E e): Adds the element if it is not already present.
    2. contains(Object o): Returns true if this set contains the specified element.
    3. remove(Object o): Removes the specified element from the set.
    4. clear(): Removes all elements from the set.

Syntax:

    Set<String> set = new HashSet<>();
    set.add("Apple");
    boolean hasApple = set.contains("Apple");

Technical Explanation:

    • Backed by a HashMap instance internally.
    • Elements are not ordered; you cannot predict the iteration order.
    • Allows at most one null element.

Important:

    Custom objects stored in a HashSet must properly override hashCode() and equals() methods.
*/
import java.util.HashSet;
import java.util.Set;

public class hashSetExample {
    public static void main(String[] args) {
        System.out.println("--- HashSet Example ---");
        // unordered collection, no duplicates allowed
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate will be ignored

        System.out.println("Unique Names: " + uniqueNames);
    }
}
