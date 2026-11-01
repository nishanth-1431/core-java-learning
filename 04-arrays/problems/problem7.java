/* 7. Find the largest and smallest element in an array.
Topics: if statement, comparison, for loop
 */
public class problem7 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 5, 40};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
             if (arr[i] > largest) {
                 largest = arr[i];
                }
            if (arr[i] < smallest) {
                smallest = arr[i];
               }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
