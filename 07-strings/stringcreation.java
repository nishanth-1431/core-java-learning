/*
There are two ways to create Strings in Java:

1. String Literal
   - Stored in the String Pool.
   - Java reuses the object if the same String already exists.

2. Using new Keyword
   - Creates a new String object in Heap Memory.
   - A new object is created every time.
*/

public class stringcreation {

    public static void main(String[] args) {

        // String Literal
        String str1 = "motivate";

        // Using new Keyword
        String str2 = new String("motivate");

        System.out.println("String Literal : " + str1);
        System.out.println("Using new      : " + str2);
    }
}