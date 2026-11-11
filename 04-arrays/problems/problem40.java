/*40. Find the first repeating element in an array.
Topics: inner/outer loops or hash set approach
 */
public class problem40 {
    public static void main(String[] args){
        int[] arr = {10, 5, 3, 4, 3, 5, 6}; 
        boolean found = false ;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i + 1 ; j < arr.length ; j++ ){
                if(arr[i]==arr[j]){
                    System.out.println(" the first repeating element in an array is " + arr[i]);
                    found = true;
                    break;
                }
            }
                if(found){
                    break;
                }
        }
    }
}
