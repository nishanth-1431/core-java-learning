// 	Write a Java program to calculate perimeter of a square.

import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the square");
        double length = sc.nextDouble();
        double perimeter = 4 * length;
        System.out.println("the perimeter of the square is " + perimeter);
    }
}
