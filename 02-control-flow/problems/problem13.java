/*13.	Salary Bonus Calculator
Using (if-else)
Calculate employee bonus based on salary
 */
import java.util.Scanner;
public class problem13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary :");
        double salary = sc.nextDouble();
        if(salary<50000){
            System.out.println("you are eligible for 20% bonus");
            double bonus = salary * 0.2;
            System.out.println("Your bonus is: " + bonus); 
        }
        else{
            System.out.println("you are eligible for 10% bonus");
            double bonus = salary * 0.1;
            System.out.println("Your bonus is: " + bonus); 
        }
    }   
}
