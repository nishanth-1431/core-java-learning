/*25.	Vowel or Consonant Checker
Using (switch)
Determine whether a character is a vowel or consonant.
*/
import java.util.Scanner;

public class problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        char lowerCh = Character.toLowerCase(ch);
        
        switch (lowerCh) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if ((lowerCh >= 'a' && lowerCh <= 'z')) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println(ch + " is not an alphabetic character.");
                }
                break;
        }
    }
}
