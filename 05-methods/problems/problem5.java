/*5. Even or Odd
Determine whether a number is even or odd.
Use: Method, if-else
 */
import java.util.*;
public class problem5 {
    static void evenOdd(int num){
        if(num%2==0){
            System.out.println("\n the number is even");
        }  
         else {
            System.out.println("\n the number is odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ------EVEN OR ODD CHECKER------");
        System.out.print("\n enter a number :");
        int num =sc.nextInt();
        evenOdd(num);
    }
}
