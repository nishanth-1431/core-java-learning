/*  4.	Print all odd numbers from 1 to n. */
import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
