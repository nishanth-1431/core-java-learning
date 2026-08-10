/*  Wrapper Classes

    Definition:

        Wrapper classes are classes provided by Java that
        represent primitive data types as objects.

        Every primitive data type has a corresponding
        wrapper class.

    Primitive to Wrapper Mapping:

        byte      → Byte
        short     → Short
        int       → Integer
        long      → Long
        float     → Float
        double    → Double
        char      → Character
        boolean   → Boolean

    Technical Explanation:

        Primitive data types store values directly.

        Wrapper classes represent those values as objects.

        Wrapper objects are useful when Java requires an object
        instead of a primitive value.

        This becomes especially important when working with
        collections such as ArrayList.

    Example:

        int number = 10;

        Integer object = 10;

        Here, int is a primitive and Integer is its wrapper class.
*/

public class wrapperBasics {

    public static void main(String[] args) {

        // Primitive values
        int number = 10;
        double price = 99.99;
        char grade = 'A';
        boolean passed = true;

        // Wrapper objects
        Integer numberObject = 10;
        Double priceObject = 99.99;
        Character gradeObject = 'A';
        Boolean passedObject = true;

        System.out.println("Primitive int: " + number);
        System.out.println("Wrapper Integer: " + numberObject);

        System.out.println("Primitive double: " + price);
        System.out.println("Wrapper Double: " + priceObject);

        System.out.println("Primitive char: " + grade);
        System.out.println("Wrapper Character: " + gradeObject);

        System.out.println("Primitive boolean: " + passed);
        System.out.println("Wrapper Boolean: " + passedObject);
    }
}