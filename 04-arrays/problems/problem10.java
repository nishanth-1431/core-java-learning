/* 10. Search for an element and print its index (Linear Search).
Topics: loops, if statement, flag variable
 */
import java.util.Scanner;
 public class problem10 {
    public static void main(String[] args) {
        int[] arr= {23, 45, 12, 67, 89, 34, 56, 78, 91, 15};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be Search : ");
        int target =sc.nextInt();
        boolean found = false;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==target){
                System.out.println(" the number is found in index : "+ i);
                found = true;
                break;
            }
        }
           if(!found){
                System.out.println(" number not found !!");
            }
    }
}
