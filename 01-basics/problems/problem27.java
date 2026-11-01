// Write a Java program using Scanner to calculate total marks and print average.
import java.util.Scanner;
public class problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter Marks for Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter Marks for Subject 3: ");
        double m3 = sc.nextDouble();
        double total = m1 + m2 + m3;
        double average = total / 3.0;
        System.out.println("\n--- Marks Report ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
