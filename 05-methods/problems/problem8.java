/* 8. Insurance Risk Category
Inputs: Age, Accidents
Return: Low / Medium / High Risk
Use: Nested if-else
 */
import java.util.*;
public class problem8 {
   static String insurance(int age , int accidents) {
    if(age<30){
             if(accidents<3 && accidents>0){
                return "Medium risk";
             }
             else if (accidents==0) {
                 return"Low risk";
             }
             else{
                return"High risk";
             }
    } 
    else {
         if(accidents>1 && accidents<3){
                return "Medium risk";
             }
             else if (accidents<2) {
                    return"Low risk";
             }
             else{
                return"High risk";
             }
    }
   }
   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("------INSURANCE RISK CHECKER------");
         System.out.print("Enter age             :");
         int age = sc.nextInt();
         System.out.print("Enter no of accidents :");
         int accidents = sc.nextInt();
         String risk = insurance(age, accidents);
         System.out.printf("RISK STATUS           : %s%n ",risk);
   }
}
