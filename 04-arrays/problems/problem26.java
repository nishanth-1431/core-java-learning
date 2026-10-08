/*26. Find the product of all elements in an array.
Topics: loops, multiplication accumulator
 */
class problem26{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int product = 1;
        for (int num : arr) {
            // if(num == 0) continue; if they asked sum of all non zero elements
            product*=num;
        }
        System.out.println("product of all elements in an array : "+product);
    }
}