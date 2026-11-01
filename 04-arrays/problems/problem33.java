/*
    33. Move all negative elements to the beginning of the array.
    Topics: Partitioning, Two Pointers
*/

import java.util.Arrays;

public class problem33 {
    public static void main(String[] args) {

        int[] arr = {12, -5, 8, -3, 15, -10, 7};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}