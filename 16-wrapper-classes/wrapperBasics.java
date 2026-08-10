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
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40L;
        float floatValue = 50.5f;
        double doubleValue = 60.5;
        char charValue = 'A';
        boolean booleanValue = true;

        // Corresponding wrapper objects
        Byte byteObject = 10;
        Short shortObject = 20;
        Integer intObject = 30;
        Long longObject = 40L;
        Float floatObject = 50.5f;
        Double doubleObject = 60.5;
        Character charObject = 'A';
        Boolean booleanObject = true;

        System.out.println("Primitive byte: " + byteValue);
        System.out.println("Wrapper Byte: " + byteObject);

        System.out.println("Primitive short: " + shortValue);
        System.out.println("Wrapper Short: " + shortObject);

        System.out.println("Primitive int: " + intValue);
        System.out.println("Wrapper Integer: " + intObject);

        System.out.println("Primitive long: " + longValue);
        System.out.println("Wrapper Long: " + longObject);

        System.out.println("Primitive float: " + floatValue);
        System.out.println("Wrapper Float: " + floatObject);

        System.out.println("Primitive double: " + doubleValue);
        System.out.println("Wrapper Double: " + doubleObject);

        System.out.println("Primitive char: " + charValue);
        System.out.println("Wrapper Character: " + charObject);

        System.out.println("Primitive boolean: " + booleanValue);
        System.out.println("Wrapper Boolean: " + booleanObject);
    }
}