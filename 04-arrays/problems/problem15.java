/* 11. Count how many times a given element occurs in an array.
   Topics: loops, counter variable, equality check
*/
import java.util.Scanner;
public class problem15 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 8, 3, 2, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to count: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println(target + " occurs " + count + " time(s) in the array.");
    }
}
