/*19.	ATM Withdrawal Validation
Using (if-else)
Check whether sufficient balance is available. 
*/
import java.util.*;
public class problem19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount of withdrawl :");
        int amt = sc.nextInt();
        int balance = 14310;
        if(amt < balance){
            System.out.println("the amount is withdrawn");
            balance = balance - amt;
            System.out.println("the available balance is Rs."+balance);
        }
        else{
            System.out.println("insufficent balance");
        }
    }
}