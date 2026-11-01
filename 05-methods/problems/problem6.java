/*6. Positive, Negative, or Zero
Classify a number.
Use: Method, if-else ladder
 */
import java.util.Scanner;
public class problem6 {
    static void classifyNumber(int num){
        if(num > 0){
            System.out.println("\n the number is positive");
        }
        else if(num < 0){
            System.out.println("\n the number is negative");
        }
        else{
            System.out.println("\n the number is zero");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ------NUMBER CLASSIFIER------");
        System.out.print("\n enter a number :");
        int num =sc.nextInt();
        classifyNumber(num);
    }
}
