/*33. Move all negative elements to the beginning of the array.
Topics: partitioning, two-pointer
 */
import java.util.Arrays;
public class problem33 {
    public static void main(String[] args){
        int[] arr = {12, -5, 8, -3, 15, -10, 7};
        int index = arr.length - 1;
        int temp = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] > 0){
                arr[index] = arr[i];
                index--;
            }
        }
        while (index < arr.length) {
            arr[index] = 0 ;
            index++;
        }
        System.out.println(Arrays.toString(arr));

    }
}
