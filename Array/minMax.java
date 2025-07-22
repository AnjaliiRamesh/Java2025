// 7.	Find the maximum and minimum element in an array.
// ➤ Input: {4, 2, 9, 1}
// ➤ Output: Max: 9, Min: 1



public class minMax {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1};
        int maxi = arr[0];
        int mini = arr[0];

        //for Maximum element
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i] > maxi ){
                maxi = arr[i];
            }    
        }
            System.out.println("max element is: " +maxi);

        //for minimum element
        for(int i=1; i<n; i++){
            if(arr[i] < mini ){
                mini = arr[i];
            }    
        }
            System.out.println("minimum element is: " +mini);
    }
    
    
}
