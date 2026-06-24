/* 8. Count the number of even and odd elements in an array.
Topics: modulus operator (%), if-else, counter variables
 */
public class problem8 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int evencount = 0;
        int oddcount = 0;
        for(int i =0; i<arr.length;i++){
            if(i%2==0){
                evencount++;
             }
             else{
                oddcount++;
             }
        }
        System.out.println("number of even numbers in array : "+evencount);
        System.out.println("number of odd numbers in array : "+oddcount);
    }
}
