/*5.	Pass or Fail
Using (if-else)
Write a program to determine whether a student has passed or failed. 
 */
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks ");
        int marks = sc.nextInt();
        if (marks>50){
             System.out.println("you passed !!");
        }
        else{
             System.out.println("you failed :( ");
        }
    }
}
