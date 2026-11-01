/* 15. Print the matrix row by row.
   Topics: nested loops
*/
public class problem15 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
