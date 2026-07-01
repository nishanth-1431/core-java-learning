/* 12. Print the array in reverse order.
   Topics: reverse traversal, for loop
*/
public class problem12 {
    public static void main(String[] args) {
        int[] arr = {42, 17, 89, 5, 63, 28, 91, 14, 56, 37};

        System.out.println("Array in Reverse Order:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}