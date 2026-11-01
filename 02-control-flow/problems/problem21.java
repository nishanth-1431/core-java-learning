/*21.	Day Name Display
Using (switch)
Display the day name for numbers 1 to 7. 
*/
import java.util.Scanner;
public class problem21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number between(1-7) : ");
        int day = sc.nextInt();
        switch(day){
            case 1:
            System.out.print("monday");
            break;
            case 2:
            System.out.print("tuesday");
            break;
            case 3:
            System.out.print("wednesday");
            break;
            case 4:
            System.out.print("thursday");
            break;
            case 5:
            System.out.print("friday");
            break;
            case 6:
            System.out.print("saturday");
            break;
            case 7:
            System.out.print("Sunday");
            break;
            default:
            System.out.print("invalid number");
            break;
          }    
        }
}

        
    