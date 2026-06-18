/*4. Reverse a string without using any built-in reverse method.
   Topics: charAt(), loops, String concatenation
 */
import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1 ; i>=0 ; i-- ){
            rev = rev+ str.charAt(i);
        }
        System.out.print("the reversed string is "+rev);
    }
}
