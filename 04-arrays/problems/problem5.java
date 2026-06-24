/* 5. Find the sum of all elements in an array.
Topics: accumulator pattern, for loop
 */
public class problem5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        System.err.print("  the array values are : ");
        for(int i =0 ; i<arr.length;i++){
            sum = sum + arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n sum of all array elements :"+sum);
    }
}
