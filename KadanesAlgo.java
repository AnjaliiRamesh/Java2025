public class KadanesAlgo {

    public static void Kadanes(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for(int i=0; i< arr.length; i++){
         cursum += arr[i];
            maxsum = Math.max(maxsum, cursum);
            if (cursum <0){
                cursum = 0;
            }
        }
        System.out.println("maxsum is: " +maxsum);
    }
    public static void main(String[] args) {
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-2, -4};
    Kadanes(arr);  
    }
    
}
