/* 18. Find the largest and smallest element in a matrix.
   Topics: nested loops, if statement
*/
public class problem18 {
    public static void main(String[] args) {

        int[][] matrix = {
            {5, 2, 8},
            {1, 9, 3},
            {7, 4, 6}
        };

        int largest = matrix[0][0];
        int smallest = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element in matrix: " + largest);
        System.out.println("Smallest element in matrix: " + smallest);
    }
}
