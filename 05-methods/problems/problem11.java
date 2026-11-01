/*11. Grade Calculator
Return:
•	A (90+) 
•	B (80+) 
•	C (70+) 
•	D (60+) 
•	F (<60) 
Use: else-if ladder
 */
import java.util.*;
public class problem11 {
    static char grade(int marks){
        if(marks>=90){
            return 'A';
        }
        else if(marks>=80){
            return 'B';
        }
        else if(marks>=70){
            return 'C';
        }
        else if(marks>=60){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();
        char grade = grade(marks);
        if(grade=='A' && grade<='D'){
            System.out.printf("congrats you got %c grade",grade);
        }
        else{
            System.out.printf("your grade is %c , better luck next time ",grade);
        }
    }
}
