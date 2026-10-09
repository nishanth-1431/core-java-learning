/*30. Swap the largest and smallest elements in an array.
Topics: index tracking, swap logic
 */
public class problem30 {
    public static void main(String[] args) {
        int[] arr = {34, 12, 67, 5, 89, 23, 41};
        int largest = arr[0];
        int smallest = arr[0];
        int largestIndex = 0;
        int smallestIndex = 0;
        int temp = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if (largest < arr[i]) {  // it updates the largest element ( with its index ) array through every iteration
                largest = arr[i];
                largestIndex = i;
            }
            if (smallest > arr[i]) {  // it updates the Smallest element ( with its index ) array through every iteration
                smallest = arr[i];
                smallestIndex = i;
            }
        }

        // swaps the largest and smallest value in the array arr
        temp = arr[largestIndex];
        arr[largestIndex] = arr[smallestIndex];
        arr[smallestIndex] = temp;

        System.out.println("Largest : " + largest + " , Smallest : " + smallest);

        System.out.print("Swapped array : ");

        for (int num : arr) { // this loop is used to print the final swapped array
            System.out.print( num + " ");
        }
    }
}
