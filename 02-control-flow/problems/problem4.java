/*4.	Voting Eligibility
Using (if)
Write a program to check whether a person is eligible to vote. 
 */
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = sc.nextInt();
       if(age>=18){
        System.out.println(" you are eligible to vote ");
        }
        else{
         System.out.println(" you should be 18 or above to vote ");
        }
    }
}
