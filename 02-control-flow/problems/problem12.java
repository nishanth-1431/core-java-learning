/*  12.	Student Grade Calculator
Using (if-else-if ladder)
Display grades A, B, C, D, or F based on marks. 
 */
import java.util.Scanner;
public class problem12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your mark ");
        int marks = sc.nextInt();
        char grade;
        if( marks>=90 ){
            grade = 'A';
            }
        else if (marks>=80){
            grade = 'B';
        }
        else if (marks>=70){
            grade = 'C';
        }
        else if (marks>=60){
            grade = 'D';
        }
        else {
            grade ='F';
        }
        System.out.printf("the grade earned is %c",grade);
    }
}

