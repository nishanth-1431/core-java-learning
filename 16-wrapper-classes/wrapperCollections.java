/*  Wrapper Classes with Collections

    Definition:

        Java collections work with objects, not primitive data types.

        Therefore, wrapper classes are used when storing primitive
        values inside collections such as ArrayList.

        For example:

            ArrayList<int> numbers = new ArrayList<>();

        is invalid because int is a primitive.

        Instead, we use:

            ArrayList<Integer> numbers = new ArrayList<>();

    Technical Explanation:

        Wrapper classes allow primitive values to be stored inside
        collections.

        Java automatically performs autoboxing when a primitive
        value is added to a collection.

            numbers.add(10);

        The int value 10 is automatically converted into an
        Integer object.

        When a value is retrieved, Java can automatically perform
        unboxing when a primitive is required.

            int number = numbers.get(0);

        Here, the Integer object is automatically converted into
        an int.

    Common Examples:

        ArrayList<Integer>
            Stores int values as Integer objects.

        ArrayList<Double>
            Stores double values as Double objects.

        ArrayList<Character>
            Stores char values as Character objects.

        ArrayList<Boolean>
            Stores boolean values as Boolean objects.
*/

import java.util.ArrayList;

public class wrapperCollections {

    public static void main(String[] args) {

        // ArrayList uses Integer instead of int
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // Autoboxing: int → Integer
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        // Retrieving an Integer object
        Integer numberObject = numbers.get(0);

        System.out.println("Wrapper value: " + numberObject);

        // Unboxing: Integer → int
        int number = numbers.get(1);

        System.out.println("Primitive value: " + number);


        // ArrayList with Double
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(99.99); // Autoboxing: double → Double
        prices.add(149.50);
        prices.add(250.75);

        System.out.println("Prices: " + prices);


        // ArrayList with Character
        ArrayList<Character> grades = new ArrayList<>();

        grades.add('A'); // Autoboxing: char → Character
        grades.add('B');
        grades.add('C');

        System.out.println("Grades: " + grades);


        // ArrayList with Boolean
        ArrayList<Boolean> results = new ArrayList<>();

        results.add(true); // Autoboxing: boolean → Boolean
        results.add(false);

        System.out.println("Results: " + results);


        // Using a for loop with Integer objects
        for (Integer value : numbers) {

            System.out.println("Value: " + value);
        }
    }
}