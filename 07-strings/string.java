/* -- String :
      - A String in Java is an object used to store a sequence of characters enclosed in double quotes
      - Strings are immutable, meaning their value cannot be changed after creation
      Example:
          String name = "Geeks";
          String num = "1234";
*/
public class string {
    public static void main(String [] args){
        String str = new String("hello"); // create a string using new keyword
        System.out.println(str); // prints the string str
    }
}
/* String class :
   Stored in the String Pool to optimize memory usage and reuse objects.
   Immutable nature ensures better security and thread safety.
   Can be created using string literals or the new keyword.
   
   Key features :
   1. immutable 
          Immutable means that once a String object is created, its value cannot be changed.
   2. Thread safe 
          String in Java is thread-safe because it is immutable, 
          allowing safe access by multiple threads without synchronization.
   3. various utlity methords
          String is a predefined final class in Java present in java.lang package.
   4. implements interferences
          CharSequence: Allows access to characters in the string using charAt(), length(), etc.
          Comparable<String>: Enables comparing two strings lexicographically using compareTo()
          Serializable: Allows string objects to be converted into a byte stream    
 */