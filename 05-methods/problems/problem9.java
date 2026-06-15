/*9. Income Tax Slab Calculator
Rules:
•	Income ≤ 3,00,000 → No Tax 
•	Income ≤ 7,00,000 → 5% 
•	Income ≤ 10,00,000 → 10% 
•	Above 10,00,000 → 20% 
Use:
•	else-if ladder
 */
import java.util.*;
public class problem9 {
    static double  incometax(int income){
        if(income<=300000){
            return 0;
        }
        else if(income<=700000 ){
            return income*0.05;
        }
        else if(income<=1000000 ){
            return income*0.1;
        }
        else {
            return income*0.2;
        }
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----INCOME TAX CALCULATOR-----");
        System.out.print("Enter your income  :");
        int income = sc.nextInt();
        double tax = incometax(income);
        double balance = income - tax ;
        System.out.println("income             :"+income);
        System.out.println("tax generated      :"+tax);
        System.out.println("balance            :"+balance);
        }
    } 
    

