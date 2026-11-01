/*6.	Find the factorial of a number.  */
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int factorial = 1 ;
        for(int i = 1 ; i<=n ; i++){
            factorial = factorial * i;
        }
        System.out.printf(" the factorial of %d is %d",n,factorial);
    }
}
