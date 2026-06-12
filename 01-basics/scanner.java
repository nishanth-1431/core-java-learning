/*  scanner class is Used for reading input in Java programs and Accept data from user
    import java.util.Scanner;    
    */

import java.util.Scanner;
public class scanner {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age: ");
       int a = sc.nextInt();
         System.out.println("Your age is " + a); 
    }
}
/*  
    Scanner class has various methods to read different types of data from user input. Some of the commonly used methods are:
    nextInt(): Reads an integer value from the user.
    nextDouble(): Reads a double value from the user.
    nextLine(): Reads a line of text from the user.
    next(): Reads a single word from the user.
    nextBoolean(): Reads a boolean value from the user.
    nextFloat(): Reads a float value from the user.
    nextLong(): Reads a long value from the user.
    nextShort(): Reads a short value from the user.
    nextByte(): Reads a byte value from the user.
 */
