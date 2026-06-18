/* 6. Count how many times a specific character appears in a string.
   Topics: charAt(), loops, if-else
 */
import java.util.*;
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string  :");
        String str = sc.nextLine();
        System.out.print("Enter a Specific character :");
        char target = sc.next().charAt(0);
        int count =0;
        for(int i =0 ; i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        System.out.println("Character "+ target +" appears "+count+" times");
        sc.close();
    }
}
