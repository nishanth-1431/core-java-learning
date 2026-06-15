/* 1. Voting Eligibility
Check whether a person is eligible to vote.
Use: Method, parameter, if-else
 */
import java.util.*;
public class problem1 {
    static void eligiblity(int age){  // method definition with parameter
        if(age>=18){
            System.out.println("you are eligible to vote");
        }  
         else {
            System.out.println("you are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        eligiblity(age);                   // method call
    } 
}
