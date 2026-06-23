/* What is Array?
        - An array is a collection of elements of the same data type stored in contiguous memory locations. 
        - It allows multiple values to be stored under a single name and accessed using an index. 
        - Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
        Syntax:
        dataType[] arrayName; (or)
        dataType arrayName[];
   */
public class ArrayBasics {
    public static void main(String[] args) {

        // primitive array - stores int, char, boolean and traversed using loop
        int[] arr =  {1,2,3,4};  // creating array (primitive array)

        // non primitive array - The non-primitive array stores String objects and is printed in the same way using its length property.
        String[] name = {"elon" , "jeff"}; // creating array (non primitive array)

        //  Initialization of arrays :
        // 1. Array Literal Initialization
        int[] arr1 = {1, 2, 3, 4};

        // 2.Array Creation with new
        int[] arr2 = new int[4];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
    }
}
