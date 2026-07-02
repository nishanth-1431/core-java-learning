/* Multi-Dimensional Arrays (2D arrays):
         - A multi-dimensional array in Java is an array of arrays that
          allows data to be stored in tabular form such as rows and columns 
        - Helps store and manage data in multiple dimensions (rows and columns).
        - Most commonly used type is the two-dimensional (2D) array.

        - Syntax:
         dataType[][] arrayName = new dataType[rows][columns];

        - Example:
         int[][] arr = new int[3][3];
         // Creates a 3x3 matrix with default value 0.

*/
public class array2D {
    public static void main(String[] args) {

        // Declaring and initializing a 3x3 2D array
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Printing the elements of the 2D array
        System.out.println("Elements of the 2D Array:");

        for (int i = 0; i < arr.length; i++) {          // Rows
            for (int j = 0; j < arr[i].length; j++) {   // Columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
