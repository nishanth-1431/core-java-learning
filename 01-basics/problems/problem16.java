// Write a Java program using Scanner to read student name and age.
import java.util.Scanner;
public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
