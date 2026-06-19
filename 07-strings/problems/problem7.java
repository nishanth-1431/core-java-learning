/*7. Remove all spaces from a string using String Buffer.
Example:
"Java Full Stack" → "JavaFullStack"
Topics: charAt (), loops, String Buffer, append()
*/
import java.util.*;
public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  :");
        StringBuffer str = new StringBuffer(sc.nextLine());
        StringBuffer str1 = new StringBuffer("");
        for(int i = 0 ; i < str.length(); i++ ){
           if(str.charAt(i)!= ' '){
             str1.append(str.charAt(i));           
            }
        }
        System.out.println(" String sithout Spaces :"+ str1);
    }
}
