/* 20. Print the secondary diagonal elements and find their sum.
   Topics: nested loops, condition (i + j == size - 1)
*/
public class problem20 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int size = matrix.length;
        int sum = 0;
        System.out.print("Secondary diagonal elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("\nSum of secondary diagonal: " + sum);
    }
}
