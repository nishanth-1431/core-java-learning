/* 2.Blood Donation Eligibility
Check whether a person can donate blood.
Conditions:
	Age ≥ 18   and Weight ≥ 50 kg 
 */
import java.util.*;
public class problem2 {
    static void eligiblity(int age, int weight){
        if(age>=18 && weight >=50){
            System.out.println("\n you are eligible to donate blood");
        }  
         else {
            System.out.println("\n you are not eligible to donate blood");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ------BLOOD DONATION ELIGIBLITY CHECKER------");
        System.out.print("\n enter your age          :");
        int age =sc.nextInt();
        System.out.print("\n enter your weight (kg)  :");
        int weight =sc.nextInt();
        eligiblity(age,weight);
    }
}
