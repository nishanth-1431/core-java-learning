//	Write a Java program to calculate total and average of 5 subject marks.

import java.util.Scanner;
public class problem5 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks of 5 subjects:");
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    int m3 = sc.nextInt();
    int m4 = sc.nextInt();
    int m5 = sc.nextInt();
    int total = m1 +m2+m3+m4+m5;
    double average = total/5.0;
    System.out.println("Total marks: " + total);
    System.out.println("Average marks: " + average);
    }
}
