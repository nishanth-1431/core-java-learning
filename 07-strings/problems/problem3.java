 /* 3. Count the number of vowels, consonants, digits, and spaces in a string.
   Topics: charAt(), if-else, loops
*/
import java.util.*;
public class problem3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String :");
      String str = sc.nextLine();
      int length = str.length();
      int vowels = 0;
      int consonants=0;
      int digits = 0;
      int spaces = 0;
      for (int i = 0; i < length-1; i++) {
          char ch = str.charAt(i);
          if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'||
             ch =='A'|| ch =='E' || ch == 'I' || ch == 'O'|| ch == 'U' ) {
             vowels++;
          }
          else if((ch >= 'a' && ch<='z')||(ch>='A' && ch<='Z')){
            consonants++;
          }
          else if(ch>='0'&&ch<='9'){
            digits++;
          }
          else if(ch==' '){
            spaces++;
          }
        }
        System.out.println("Number of vowels     :"+vowels);
        System.out.println("Number of consonants :"+consonants);
        System.out.println("Number of Digits     :"+digits);
        System.out.println("Number of Spaces     :"+spaces);
    
    }
}