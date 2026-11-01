/*3.	Largest of Two Numbers
Using (if-else)
Write a program to find the largest of two numbers. 
 */

import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1 = sc.nextInt();
        System.out.println("enter number 2");
        int n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("number 1 is greater than number 2");
        }
        else{
                 System.out.println("number 2 is greater than number 1");
        }
    }
}