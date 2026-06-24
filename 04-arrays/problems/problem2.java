/* Take 5 elements from the user and store them in an array.
   Topics: Scanner, array, for loop
 */
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i<arr.length;i++){
        System.out.print(" Enter the value of index "+ i +" :");
        arr[i]= sc.nextInt();
        }

    }
}
