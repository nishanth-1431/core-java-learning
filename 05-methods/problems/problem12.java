/*12. Salary Bonus Eligibility
Bonus only if salary is below ₹30,000.
Use: Method, if-else
 */
import java.util.*;
public class problem12 {
    static String bonus(int salary){
        if(salary<30000){
            return "you are eligible for bonus";
        }
        else{
            return "you are not eligible for bonus";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary :");
        int Salary = sc.nextInt();
        String result = bonus(Salary);
        System.out.println(result);
    }
}
