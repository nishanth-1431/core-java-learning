/* 12. Find the sum of all even elements in an array.
   Topics: loops, modulus operator (%), accumulator
*/
public class problem16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum of all even elements: " + sum);
    }
}
