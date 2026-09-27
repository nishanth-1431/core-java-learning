/* 19. Print the primary diagonal elements and find their sum.
   Topics: nested loops, condition (i == j)
*/
public class problem19 {
    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        System.out.print("Primary diagonal elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("\nSum of primary diagonal: " + sum);
    }
}
