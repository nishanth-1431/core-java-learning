/*15. Hospital Priority
Inputs: Age, Emergency Level
Return: Critical / High / Normal
Use: Nested if-else
 */
import java.util.*;
public class problem15 {
    static String priority(int age, int level )
    {
        if(level>=3){
            if(age>=50){
               return "Critical";
            }
            else{
                return "High";
            }
        }
        else{
             if(age>=50){
                return "High";
              }
            else{
               return "Normal";
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Emergency level   :");
            int level = sc.nextInt();
            System.out.print("Enter your age:");
            int age = sc.nextInt();
            String priority = priority(age, level);
            System.out.printf("Patient Priority : %s%n", priority);
    }
}
