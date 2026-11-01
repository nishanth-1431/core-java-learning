/* 34. Separate even and odd elements: print evens first, then odds.
Topics: two-pass, condition check
 */
public class problem34 {
    public static void main(String[] args) {
        int[] arr = {12, 7, 4, 9, 6, 3, 10, 5};
        System.out.print("\n even : ");

         for(int num : arr){
            if( num % 2 == 0){
                System.out.print( num + " ");
            }
        }
        System.out.print(" odd : ");
        for(int num : arr){
            if( num % 2 != 0){
                System.out.print(num + " ");
            }
        }
    }
}
