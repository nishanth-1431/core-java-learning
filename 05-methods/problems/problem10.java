/* 10. Scholarship Eligibility
Inputs: Marks, Family Income
Return: Full / Partial / No Scholarship
Use: Multiple conditions
 */
import java.util.*;
public class problem10{
    static String eligiblity(int marks, int income){
        if(marks >=90 && income<400000){
            return "full Scholarship";
        }
        else if(marks>=80 && income<300000){
            return "partial Scholarship";
        }
        else{
            return "no Scholarship";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Scholarship Eligibility-----");
        System.out.print("Enter your marks         :");
        int age = sc.nextInt();
        System.out.print("Enter your family income :");
        int income = sc.nextInt();
        String status = eligiblity(age, income);
        System.out.println("you are eligible for "+status);
    }
}