/*10.	Greatest of Three Numbers
Using (nested if)
Write a program to find the greatest of three numbers. 
 */
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the greatest");
            } else {
                System.out.println(c + " is the greatest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the greatest");
            } else {
                System.out.println(c + " is the greatest");
            }
        }
    }
}