/*  11.	Number Classification
Using (if-else-if ladder)
Display Positive, Negative, or Zero. 

 */
import java.util.Scanner;
public class problem11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if(n>0){
            System.out.printf("%d is a positive number ",n);
        }
        else if(n<0){
            System.out.printf("%d is a negative number ",n);
        }
        else{
            System.out.println("the number is zero");
        }
    }
    
}
