/*9.Leap Year Checker
Using (if-else)
Write a program to check whether a year is a leap year
*/
import java.util.Scanner;
public class problem9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap year ");
        }
        else{
            System.out.println("not a Leap year");
        }
    }
}