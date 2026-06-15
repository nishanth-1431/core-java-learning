/*4. Student Pass/Fail
Return Pass if marks ≥ 35, otherwise Fail.
Use: Method, return value
 */
import java.util.*;
public class problem4 {
    static String result(int marks){
        if(marks>=35){
            return "Pass";
        }  
         else {
            return "Fail";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ------STUDENT PASS/FAIL CHECKER------");
        System.out.print("\n enter your marks :");
        int marks =sc.nextInt();
        String res = result(marks);
        System.out.println("\n you have "+res);
    }
}
