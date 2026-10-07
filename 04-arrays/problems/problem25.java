/*25. Find the sum of all odd elements in an array.
Topics: loops, modulus operator (%), accumulator
 */
public class problem25 {
    public static void main(String[] args) {
        int[] arr = {12, -5, 0, 8, -3, 0, 15, -10, 7, -2};
        int oddSum = 0;
        for(int n : arr){
            if(n % 2 == 0)
                continue;
            else 
                oddSum += n;
        }
        System.out.println("total sum of odd numbers in array is "+ oddSum);
    }
}
