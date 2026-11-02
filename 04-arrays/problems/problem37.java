/*37. Find the frequency of every element in an array.
Topics: nested loops or boolean visited array, counting
 */
public class problem37 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2, 8, 5, 3};
        int count = 0 ;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0 ; i < arr.length ; i++) {

            if (visited[i]){
                continue;
            }

            for( int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(" element " + arr[i] + " Frequency " + count);
            count = 0;
        }
}
}
