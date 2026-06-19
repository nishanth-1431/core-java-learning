/* 8. Replace all vowels in a string with '*'.
   Topics: charAt(), if-else, StringBuilder
 */
import java.util.*;
public class problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  :");
        StringBuilder str = new StringBuilder(sc.nextLine());
        int length = str.length();
        StringBuilder result = new StringBuilder("");
        for(int i = 0 ; i < length ; i++){
            char ch = str.charAt(i) ;
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
                || ch == 'A' || ch == 'E'|| ch == 'I'|| ch == 'O' || ch == 'U'){
                    result.append('*');
                }
                else{
                    result.append(ch);
                }
        }
        System.out.println("the replaced string is :"+result);
    }
}
