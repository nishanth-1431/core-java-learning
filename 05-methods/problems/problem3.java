/*3. ATM Withdrawal Validation
Check whether sufficient balance is available.
Use: Method, multiple parameters, if-else
 */
import java.util.*;
public class problem3 {
    static void withdraw(int balance, int amount){
        if(amount <= balance){
            System.out.println("\n withdrawal successful");
            System.out.println("\n remaining balance :"+(balance-amount));
        }  
         else {
            System.out.println("\n insufficient balance");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ------ATM WITHDRAWAL VALIDATION------");
        System.out.print("\n enter your current balance :");
        int balance =sc.nextInt();
        System.out.print("\n enter withdrawal amount   :");
        int amount =sc.nextInt();
        withdraw(balance,amount);
    }
}
