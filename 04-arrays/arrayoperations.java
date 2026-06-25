/* Operations on Array Elements
      1. Access Array Elements  
           syntax : arr[INDEX] 
      2. Update Array Elements
           syntax : arr[INDEX] = value;
      3. Traverse Array
           syntax :
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); }
      4. Size of Array
            syntax : arr.length;
 */
public class arrayoperations {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};  

        // aaccesing 4th element 
         System.out.print(arr[3] + " ");
        // Accessing first element
        System.out.print(arr[0]);

        // Updating first element
        arr[0] = 5;
        System.out.println(arr[0]);

        // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
        }

        //size of array using .length 
        System.out.println("Size of array: " + arr.length);
        
    }
}
