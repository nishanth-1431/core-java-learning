/*23. Count positive, negative, and zero elements in an array.
Topics: loops, if-else if, counter variables
 */
public class problem23 {
    public static void main(String[] args) {
        int[] arr = {12, -5, 0, 8, -3, 0, 15, -10, 7, -2};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int n : arr){
            if(n > 0){
                positive++;
            }
            else if(n < 0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive elements : "+ positive);
        System.out.println("Negative elements : "+ negative);
        System.out.println("Zero elements     : "+ zero);
    }
}
