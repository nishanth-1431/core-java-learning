/*27. Check whether an array is sorted in ascending order.
Topics: loops, comparison, boolean flag
 */
public class problem27 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 18, 25, 31, 42};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) { 
            if(arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        System.out.println("the array is" + ( isSorted ? " sorted " : " not sorted "));
    }
}

