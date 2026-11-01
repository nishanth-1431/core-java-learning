/* 14.	Driving License Eligibility
Using (if-else)
Check whether a person is eligible for a driving license. 

 */
import java.util.Scanner;
public class problem14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for driving license");
        }
        else{
            System.out.println("Not eligible for driving license");
        }
    }
}
