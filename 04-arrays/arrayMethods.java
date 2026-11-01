/*
 Arrays Class in Java

 The Arrays class is a utility class in the java.util package.
 It provides predefined static methods to perform operations
 like sorting, searching, comparing, copying, filling,
 and printing arrays.

 Package:
 import java.util.Arrays;
*/

import java.util.Arrays;

public class arrayMethods {
    public static void main(String[] args) {

        String[] fruits = {"Mango", "Apple", "Orange", "Banana"};

        // 1. length - Returns the number of elements.
        System.out.println("Length: " + fruits.length);

        // 2. toString() - Prints the array.
        System.out.println("Original: " + Arrays.toString(fruits));

        // 3. sort() - Sorts the array in ascending order.
        Arrays.sort(fruits);
        System.out.println("Sorted: " + Arrays.toString(fruits));

        // 4. binarySearch() - Searches an element in a sorted array.
        int index = Arrays.binarySearch(fruits, "Orange");
        System.out.println("Orange found at index: " + index);

        // 5. fill() - Fills all elements with the same value.
        String[] names = new String[3];
        Arrays.fill(names, "Java");
        System.out.println("Fill: " + Arrays.toString(names));

        // 6. equals() - Compares two arrays.
        String[] a = {"A", "B"};
        String[] b = {"A", "B"};
        System.out.println("Equals: " + Arrays.equals(a, b));

        // 7. copyOf() - Copies the entire array.
        String[] copy = Arrays.copyOf(fruits, fruits.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // 8. copyOfRange() - Copies a part of the array.
        String[] range = Arrays.copyOfRange(fruits, 1, 3);
        System.out.println("Range Copy: " + Arrays.toString(range));

        // 9. deepToString() - Prints a 2D array.
        String[][] students = {
            {"Nishanth", "Santhiya"},
            {"Rahul", "Priya"}
        };
        System.out.println("2D Array: " + Arrays.deepToString(students));
    }
}