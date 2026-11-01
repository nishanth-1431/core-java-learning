//	Write a Java program to calculate area of a rectangle.
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle: ");
    double length = sc.nextDouble();
    System.out.println("Enter the width of the rectangle: ");
    double width = sc.nextDouble();
    double area = length * width;
    System.out.println("The area of the rectangle is: " + area);
    }
}