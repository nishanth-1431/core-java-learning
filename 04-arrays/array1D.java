/* One Dimentional Arrays :
     - One of the most commonly used types of arrays is the one-dimensional array.
     - It represents a simple list of elements where each item can be accessed using a single index. */
public class array1D {

    public static void main(String[] args) {

        // Creating an array object in heap memory
        int[] arr = new int[5];

        // Updating elements
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 5;
        arr[4] = 4;

        // Accessing elements
        System.out.println("Element at index 0 : " + arr[0]);
        System.out.println("Element at index 3 : " + arr[3]);

        // Updating an element
        arr[2] = 10;

        System.out.println("\nAfter updating index 2:");
        System.out.println(arr[2]);

        // Finding the length of the array
        System.out.println("\nLength of array : " + arr.length);

        // Traversing using for loop
        System.out.println("\nTraversing using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Traversing using enhanced for loop
        System.out.println("\nTraversing using for-each loop:");
        for (int element : arr) {
            System.out.println(element);
        }

    }
}