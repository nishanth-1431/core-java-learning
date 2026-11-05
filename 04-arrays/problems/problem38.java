/*
38. Print all elements that occur more than once.
Topics: frequency counting, visited array 
*/
public class problem38 {
    public static void main(String[] args){
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
            if(count>1){
                System.out.println(" element " + arr[i] + " Frequency " + count);
            }
            count = 0;
        }
    }
}
