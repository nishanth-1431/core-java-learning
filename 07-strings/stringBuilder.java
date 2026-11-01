/* StringBuilder class:

   StringBuilder in Java represents a sequence of characters that can be modified.
   It is a mutable class, which means we can change its contents without creating
   a new object every time.

   Features:
   1. Mutable
      - Unlike String, StringBuilder objects can be modified.

   2. Not Synchronized
      - Methods are not synchronized, making it faster than StringBuffer.
      - Suitable for single-threaded applications.

   3. Dynamic Size
      - The size increases automatically when more characters are added.

   4. Efficient
      - Best choice when frequent string modifications are required.

   Constructors:
   StringBuilder()                 // Creates an empty builder with capacity 16.
   StringBuilder(int capacity)     // Creates a builder with specified capacity.
   StringBuilder(String str)       // Creates a builder containing the given string.

   Common Methods:
   append()     - Adds characters at the end.
   insert()     - Inserts characters at a specified index.
   replace()    - Replaces characters between indices.
   delete()     - Removes characters from a range.
   reverse()    - Reverses the sequence.
   length()     - Returns the number of characters.
   capacity()   - Returns the current capacity.
   charAt()     - Returns the character at a given index.
   setCharAt()  - Changes a character at a specified index.
   toString()   - Converts StringBuilder into String.

   Syntax:
   StringBuilder s = new StringBuilder();

*/

public class stringBuilder {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder s = new StringBuilder("Java");

        // append()
        s.append(" Programming");
        System.out.println("After append : " + s);

        // insert()
        s.insert(5, "Language ");
        System.out.println("After insert : " + s);

        // replace()
        s.replace(0, 4, "Core");
        System.out.println("After replace : " + s);

        // delete()
        s.delete(5, 14);
        System.out.println("After delete : " + s);

        // reverse()
        s.reverse();
        System.out.println("After reverse : " + s);

        // length()
        System.out.println("Length : " + s.length());

        // capacity()
        System.out.println("Capacity : " + s.capacity());

        // charAt()
        System.out.println("Character at index 2 : " + s.charAt(2));

        // setCharAt()
        s.setCharAt(2, 'X');
        System.out.println("After setCharAt : " + s);

        // toString()
        String str = s.toString();
        System.out.println("String value : " + str);

    }
}