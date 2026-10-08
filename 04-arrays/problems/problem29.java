/* 29. Reverse an array in-place (without creating another array).
Topics: two-pointer, swap, in-place modification
*/
public class problem29 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int left = 0;
        int right = arr.length - 1;
        int temp = 0;
        while( left < right){

            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
