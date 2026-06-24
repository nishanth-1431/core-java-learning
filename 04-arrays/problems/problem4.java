/* 4. Update an element at a given index and print the updated array.
Topics: indexing, assignment
 */
import java.util.*;
public class problem4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,20,30,40,50};
    System.out.print(" enter the index to be updated :");
    int index = sc.nextInt();
    System.out.print(" Enter the value :");
    arr[index]= sc.nextInt();
    System.out.print(" The updated array is : ");
    for(int i = 0 ; i<arr.length;i++){
        System.out.print(" " +arr[i]);
     }
     sc.close();
   }
}
