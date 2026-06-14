/* 7.	Divisible by 3 and 5
Using (if, logical AND operator &&)
Write a program to check whether a number is divisible by both 3 and 5. 

*/
import java.util.Scanner;
public class problem7 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number :");
    int n = sc.nextInt();
    if(n%3==0 && n%5==0){
        System.out.printf("this number %d can be divisible by both 3 and 5 ",n);
    }
    else{
        System.out.printf("the number %d can't divisible by both 3 and 5  ",n);
    }
    }
}
