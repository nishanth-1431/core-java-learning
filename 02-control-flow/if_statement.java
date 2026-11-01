/*  if statement is used to execute a block of code if a specified condition is true. 
It is a fundamental control flow statement in programming that allows you to make decisions based on certain conditions.
Syntax :
if(condition){
  // code to be executed if the condition is true
  }
  else{
    // code to be executed if the condition is false
    }   
*/
import java.util.Scanner;
public class if_statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int age = sc.nextInt(); 
        if(age>17){                                                   // only execute when the age is greater than 17
            System.out.println("You are eligible to enter");
        }
        else{
            System.out.println("You are not eligible to enter");   // only execute when the age is less than or equal to 17
            }
    }
    
}
/* else statement is used to execute a block of code if the specified condition in the if statement is false. */