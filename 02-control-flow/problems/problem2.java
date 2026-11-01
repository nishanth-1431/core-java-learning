/* 2.	Even or Odd
Using (if-else)
Write a program to check whether a number is even or odd. */
import java.util.Scanner;
public class problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("the number is even ");
        }
        else{
            System.out.println("the number is odd ");
        }
    }
}
