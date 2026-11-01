/* 36. Delete an element from a given position in an array.
Topics: shifting elements, index management
 */

import java.util.Arrays;

public class problem36 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        int[] arr2 = new int[arr.length - 1]; 
        int position = 2;

        for(int i = arr.length - 1 ; i >= 0 ; i-- ){
            if( i > position ){
                arr2[i - 1] = arr[i];
            }
            else if (i == position){
                continue;
            }
            else{
                arr2[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
