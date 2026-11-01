/*
    Number Guessing Game

    - Console-based game in Java.
    - Currently under development.
    - Features and game logic will be implemented gradually.
    - HTML, CSS, and JavaScript UI will be added in future updates.
*/
import java.lang.*;
import java.util.*;
class Game {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int num = 1 + (int)(100* Math.random());
    int attempts = 0;
    int k = 5;
    boolean correctguessing = false ;
    System.out.println("---------- NUMBER GUESSING GAME ----------");
    System.out.println("    A number is chosen between 1 - 100    ");
    System.out.println(" you have "+ k +" attempts to guess right ");
    while(!correctguessing){
        for(int i = 0 ; i<k ;i++){
            attempts= 5-(i+1);
            System.out.print("Enter your Guess       :");
            int guess = sc.nextInt();
            if(num==guess){
            System.out.println("congrats ! you guessed right in "+ attempts +" attempts .");
            correctguessing = true;
            break;
            }
            else if(num>guess){
                System.out.println("the number is greater than "+guess);
                System.out.println("you only have "+attempts+" attempts ");
            }
            else{
                System.out.println("the number is less than "+ guess);
                System.out.println("you only have "+attempts+" attempts ");
            }
        }
        if(!correctguessing){
            System.out.println("You used all your attempts ");
            System.out.println("are you willing to restart ? (yes\no) :");
            String respond = sc.next();
            if(!respond.equalsIgnoreCase("yes")){
               System.out.println("game over ! the correct number was : "+num);
               break;
            }
        }
    }
    sc.close();
}
}