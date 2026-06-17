/* 2. Print the first, middle, and last character of a string.
   Topics: charAt(), length(), if-else
 */
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String  :");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("The Length of the String      : "+length);
        char first = str.charAt(0);
        System.out.println("The first letter of String    : "+first);
        if(length % 2==0){
            char middle1 = str.charAt(length/2 - 1);
            char middle2 = str.charAt(length/2);
        System.out.println(" The middle letters of String : "+ middle1 +" and "+ middle2);
        }
        else{
            char middle = str.charAt(length/2);
        System.out.println("The middle letter of String   : "+ middle);
        }
        char last = str.charAt(length-1);
        System.out.println("The last letter of String     : "+first);
    }
}