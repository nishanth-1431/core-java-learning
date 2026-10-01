/*21. Find the second largest element in an array.
Topics: loops, sorting logic, max tracking
 */
public class problem21 {
    public static void main(String[] args) {
        int[] arr ={ 2, 56 , 77 , 27};
        int largest = arr[0];
        int second = Integer.MIN_VALUE;
        for(int nums : arr){
            if(nums >largest){
                second = largest;
                largest = nums;
            }
        }
        System.out.println("largest num : "+ largest );
        System.out.println("Second largest num : "+ second );
    }
}
