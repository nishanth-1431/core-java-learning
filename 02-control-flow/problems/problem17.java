/*  17.	Weekday or Weekend Checker
Using (if-else-if ladder)
Display whether the day is a weekday or weekend. 

 */
import java.util.Scanner;
public class problem17 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a day of the week (1-7):");
            int day = sc.nextInt();
            if (day >= 1 && day <= 5) {
                System.out.println("It's a weekday.");
            } else if (day == 6 || day == 7) {
                System.out.println("It's a weekend.");
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
            }
   }
}
