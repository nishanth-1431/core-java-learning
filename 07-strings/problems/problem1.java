/* 1. Take a full name as input and print:
   - Original name
   - Length
   - Uppercase version
*/
import java.util.Scanner;

public class problem1 {

    public static void displayDetails(String name) {
        System.out.println("Original Name : " + name);
        System.out.println("Length        : " + name.length());
        System.out.println("Uppercase     : " + name.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        displayDetails(name);

        sc.close();
    }
}