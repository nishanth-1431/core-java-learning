/*28. Check whether an array is a palindrome.
 Topics: two-pointer approach, loops, comparison
 */
public class problem28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true ;
        while(left <= right){
            if(arr[left] == arr[right]){
                left++;
                right--;
                isPalindrome = true;
            }
            else if(arr[left] != arr[right]){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("the array is" + ( isPalindrome ? " palindrome " : " not a palindrome "));
        
    }
}
