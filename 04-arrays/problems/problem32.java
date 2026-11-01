/*32. Move all zeros to the end of the array (maintain relative order of non-zeros).
Topics: two-pointer technique, in-place

note : this is inspired by a leetcode problem . check out my Dsa-in-java repository for detailed explanation and similar solutions 
 */

import java.util.Arrays;

public class problem32 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for(int num : arr){   
            if(num != 0){
                arr[index] = num ;
                index++;
            }
        }
        while (index < arr.length) {
            arr[index] = 0 ;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
