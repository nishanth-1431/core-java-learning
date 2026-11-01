/* 22. Find the second smallest element in an array.
Topics: loops, sorting logic, min tracking
 */
public class problem22 {
    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 3, 29, 18, 56 ,12};
        int smallest = arr[0];
        int secondSmall = arr[0];
        for (int n : arr) {
            if(n<smallest){
                secondSmall=smallest;
                smallest=n;
            }
            else if(n<secondSmall && n != smallest){
                secondSmall=n;
            }
        }
        System.out.println("Smallest : "+smallest);
        System.out.println("Second Smallest : "+secondSmall);
    }
}
