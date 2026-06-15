/*7. Bank Loan Approval
Inputs: Age, Salary, Credit Score
Return: Approved / Rejected
Use: Method, &&, if-else
 */
import java.util.Scanner;
public class problem7 {
    static String eligibility(int age, double salary, int score){

    if(age < 21){
        return "Rejected: Minimum age should be 21";
    }

    if(salary < 30000){
        return "Rejected: Salary should be at least 30000";
    }

    if(score <= 681){
        return "Rejected: Credit score too low";
    }

    return "Approved";
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("--------BANK LOAN APPLICATION--------");
    System.out.print("Enter your age               : ");
    int age = sc.nextInt();
    System.out.print("Enter your salary            : ");
    double salary = sc.nextDouble();
    System.out.print("Enter your age credit score  : ");
    int score = sc.nextInt();
    String result = eligibility(age,salary,score);
    System.out.println("Loan Status: " + result);
    }
}
