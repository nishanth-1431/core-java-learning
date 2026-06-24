/*  9. Print the array in reverse order.
Topics: reverse traversal, for loop
 */
public class problem9{
        public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        for(int i = arr.length-1 ; i>=0 ; i--){
            System.out.println(arr[i]);
        }
    }
}