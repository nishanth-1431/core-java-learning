/*24. Find the difference between the largest and smallest elements.
Topics: loops, max/min tracking, subtraction
 */
public class problem24 {
    public static void main(String[] args) {
        int[] arr = {12, -5, 0, 8, -3, 0, 15, -10, 7, -2};
        int largest = arr[0];
        int smallest = arr[0];
        for(int n : arr){
            if(largest < n) largest = n;
            if(smallest > n) smallest = n;
        }
        int difference = largest - smallest;
        System.out.println(" difference : " + difference);
    }
    
}
