/* 31. Copy one array into another array.
Topics: array traversal, assignment
 */
import java.util.Arrays;

public class problem31 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }

        System.out.println("normal array : " + Arrays.toString(arr));
        System.out.print("copied array : " + Arrays.toString(arr2));

    }
}
