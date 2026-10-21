/*33. Move all negative elements to the beginning of the array.
Topics: partitioning, two-pointer
 */
import java.util.Arrays;
public class problem33 {
    public static void main(String[] args){
        int[] arr = {12, -5, 8, -3, 15, -10, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
