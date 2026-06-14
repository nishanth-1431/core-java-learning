/* 1.	Positive, Negative or Zero Using (if-else)
Write a program to check whether a number is positive, negative, or zero. */
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }
        else{
            System.out.println("the number is negative or zero");
        }
    }
}
