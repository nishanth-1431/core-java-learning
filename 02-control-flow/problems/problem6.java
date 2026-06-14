/*  6.Divisible by 5
Using (if)
Write a program to check whether a number is divisible by 5. 
*/
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a%5==0){
            System.out.printf("this number %d is divisible by 5 ", a );
        }
    }
}