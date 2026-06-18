/* 5. Check whether a string is a palindrome.
   Topics: charAt(), equals(), loops, if-else
 */
import java.util.*;
public class problem5 {
    static String reversal(String str){
      String rev = "";
        for(int i = str.length()-1 ; i>=0 ; i-- ){
            rev = rev+ str.charAt(i);
        }
         return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        String revString = reversal(str);
        if(str.equals(revString)){
            System.out.println("the String is palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
        sc.close();
    }
}

