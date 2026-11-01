/*  Wrapper Comparison

    Definition:

        Wrapper classes provide methods to compare their values.

        The compareTo() method compares one wrapper object with
        another wrapper object.

    Syntax:

        object1.compareTo(object2);

    Result:

        Negative value
            object1 is smaller than object2.

        Zero
            object1 is equal to object2.

        Positive value
            object1 is greater than object2.

    Technical Explanation:

        compareTo() is mainly used when values need to be
        compared according to their natural ordering.

        It is useful when sorting or ordering objects.

        equals() checks whether two wrapper objects contain
        equal values.

        compareTo() goes further by telling us the ordering
        relationship between the two values.
*/

public class wrapperComparison {

    public static void main(String[] args) {

        Integer first = 10;
        Integer second = 20;

        // first is smaller than second
        System.out.println("10 compareTo 20: "
                + first.compareTo(second));

        Integer third = 20;
        Integer fourth = 20;

        // Both values are equal
        System.out.println("20 compareTo 20: "
                + third.compareTo(fourth));

        Integer fifth = 30;
        Integer sixth = 20;

        // first value is greater than second value
        System.out.println("30 compareTo 20: "
                + fifth.compareTo(sixth));

        // equals() checks whether the values are equal
        System.out.println("20 equals 20: "
                + third.equals(fourth));
    }
}