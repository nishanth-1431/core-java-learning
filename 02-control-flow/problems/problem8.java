/*  8.	Uppercase or Lowercase Character
Using (if-else)
Write a program to determine whether a character is uppercase or lowercase. 
*/
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Lowercase");
        }
    }
}