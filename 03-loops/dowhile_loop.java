/* do while loop :
     - The do-while loop ensures that the code block executes at least once before checking the condition.
     Syntax :
      do {
       // code to be executed
      } while (condition);  
*/
import java.util.*;
public class dowhile_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
