/* 6. Find the average of all elements in an array.
Topics: sum, length property
 */
public class problem6 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        System.err.print("  the array values are : ");
        for(int i =0 ; i<arr.length;i++){
            sum = sum + arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n sum of all array elements :"+sum);
        double  avg = (double) sum / arr.length;
        System.out.println("average of all array elements :"+avg);
    }
}

