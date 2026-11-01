/* 13. Shopping Discount Calculator
Apply:
•	20% above ₹5000 
•	10% above ₹2000 
Use: else-if ladder
*/
import java.util.*;
public class problem13 {
    static double discount(int price){
        if(price>=5000){
            return price*0.2;
        }
        else if(price>=2000){
            return price*0.1;
        }
        else{
            return 0;
        }
    }
    static String result(int price){
          if(price>=5000){
            return "congratulation you got 20% Discount";
        }
        else if(price>=2000){
            return "congratulation you got 10% Discount";
        }
        else{
            return "no Discount";
        }
    }
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter the price :");
       int price = sc.nextInt();
       double discount = discount(price);
       String result = result(price);
       System.out.println("\n"+result);
       System.out.println("initial price              : "+price);
       System.out.println("discount price is          : "+ discount);
       System.out.printf("Final price (inc.discount) : %f", price-discount);
   } 
}
