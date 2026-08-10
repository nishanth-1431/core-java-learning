/*  Unboxing

    Definition:

        Unboxing is the automatic conversion of a wrapper object
        into its corresponding primitive data type.

        It is the reverse of autoboxing.

    Example:

        Integer object = 10;

        int number = object;

        Here, Java automatically converts the Integer object
        into an int primitive.

    Technical Explanation:

        Java automatically performs unboxing when a wrapper object
        is assigned to a variable of the corresponding primitive
        type.

        Unboxing can be performed for all wrapper classes and
        their corresponding primitive types.

    Conversion:

        Integer     → int
        Double      → double
        Character   → char
        Boolean     → boolean
        Long        → long
        Float       → float
        Short       → short
        Byte        → byte
*/

public class unboxing {

    public static void main(String[] args) {

        // Wrapper objects
        Integer numberObject = 10;
        Double priceObject = 99.99;
        Character gradeObject = 'A';
        Boolean passedObject = true;

        // Unboxing: wrapper object → primitive
        int number = numberObject;
        double price = priceObject;
        char grade = gradeObject;
        boolean passed = passedObject;

        System.out.println("Wrapper Integer: " + numberObject);
        System.out.println("Primitive int: " + number);

        System.out.println("Wrapper Double: " + priceObject);
        System.out.println("Primitive double: " + price);

        System.out.println("Wrapper Character: " + gradeObject);
        System.out.println("Primitive char: " + grade);

        System.out.println("Wrapper Boolean: " + passedObject);
        System.out.println("Primitive boolean: " + passed);
    }
}