/*  Autoboxing

    Definition:

        Autoboxing is the automatic conversion of a primitive
        data type into its corresponding wrapper object.

        Java performs this conversion automatically when a
        primitive value is assigned to a wrapper class variable.

    Syntax:

        primitiveType variable = value;

        WrapperClass object = variable;

    Example:

        int number = 10;

        Integer object = number;

        Here, Java automatically converts the int value into
        an Integer object.

    Technical Explanation:

        Autoboxing allows primitive values to be used where
        wrapper objects are required.

        Java automatically performs the conversion without
        requiring the programmer to explicitly create the
        wrapper object.

        This is especially useful when working with collections
        such as ArrayList.
*/

public class autoboxing {

    public static void main(String[] args) {

        // Primitive values
        int number = 10;
        double price = 99.99;
        char grade = 'A';
        boolean passed = true;

        // Autoboxing: primitive → wrapper object
        Integer numberObject = number;
        Double priceObject = price;
        Character gradeObject = grade;
        Boolean passedObject = passed;

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