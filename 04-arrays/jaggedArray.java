/*
 Jagged Array in Java

 A jagged array is a multi-dimensional array in which
 each row can have a different number of columns.

 Unlike a normal 2D array, all rows do not need to have
 the same size.

 Syntax:
 dataType[][] arrayName = new dataType[rows][];

 Each row is created separately with different column sizes.
*/

public class jaggedArray {
    public static void main(String[] args) {

        // Creating a jagged array
        int[][] arr = new int[3][];

        // Initializing each row with different sizes
        arr[0] = new int[]{10, 20, 30};
        arr[1] = new int[]{40, 50};
        arr[2] = new int[]{60, 70, 80, 90};

        // Printing the jagged array
        System.out.println("Jagged Array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}