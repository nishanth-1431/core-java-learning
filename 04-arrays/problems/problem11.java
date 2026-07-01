/* 11. Count the number of even and odd elements in an array.
   Topics: modulus operator (%), if-else, counter variables
*/
public class problem11 {
    public static void main(String[] args) {
        int[] arr = {42, 17, 89, 5, 63, 28, 91, 14, 56, 37};

        int oddcount = 0;
        int evencount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println("Even Count = " + evencount);
        System.out.println("Odd Count = " + oddcount);
    }
}