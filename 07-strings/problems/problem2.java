/* 2. Print the first, middle, and last character of a string.
   Topics: charAt(), length(), if-else
 */
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        int length = str.length();
        char first = str.charAt(0);
        char last = str.charAt(length-1);

    }
}
