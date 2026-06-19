/* While loop :
      A while loop is used when we want to check the condition before executing the loop body.
    Syntax :
      while (condition) {
         // code to be executed
    }
*/
import java.util.Scanner;
public class whileloop {     // Print numbers from 1 to N using a while loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}

