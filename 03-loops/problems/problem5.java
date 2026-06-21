/*  5.	Find the sum of first n natural numbers.  */
import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n; i++){
            sum += i;
        } 
        System.out.printf(" the  sum of %d natural numbers is : "+sum , n);
    }
}
