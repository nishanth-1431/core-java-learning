/*18.	Temperature Classification
Using (if-else-if ladder)
Classify temperature as Hot, Normal, or Cold. 
*/
import java.util.Scanner;
public class problem18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius :");
        int temp = sc.nextInt();
        if(temp>=30){
            System.out.println("Hot");
        }
        else if(temp>=15 && temp<30){
            System.out.println("Normal");
        }
        else{
            System.out.println("Cold");
        }
    }
}