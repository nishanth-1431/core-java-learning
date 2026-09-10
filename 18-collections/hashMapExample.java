/*
HashMap:

    HashMap stores data in key-value pairs. It provides fast basic operations
    like get and put using a hash table implementation.

Core Methods:

    1. put(K key, V value): Associates the specified value with the specified key.
    2. get(Object key): Returns the value to which the specified key is mapped.
    3. containsKey(Object key): Returns true if the map contains a mapping for the key.
    4. keySet(): Returns a Set view of the keys contained in the map.

Syntax:

    Map<String, Integer> map = new HashMap<>();
    map.put("Alice", 90);
    int score = map.get("Alice");

Technical Explanation:

    • Keys must be unique; inserting a duplicate key overwrites the old value.
    • Values can be duplicated and can be null.
    • Does not guarantee any specific order of the keys or values.

Important:

    Just like HashSet, custom objects used as keys must properly override hashCode() and equals().
*/
import java.util.HashMap;
import java.util.Map;

public class hashMapExample {
    public static void main(String[] args) {
        System.out.println("--- HashMap Example ---");
        // stores key-value pairs, fast lookup by key
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));
        System.out.println("All grades: " + studentGrades);
    }
}
