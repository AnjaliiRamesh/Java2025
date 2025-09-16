public class KadanesAlgo {

    public static void Kadanes(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for(int i=0; i< arr.length; i++){
         cursum += arr[i];
            if (cursum <0){
                cursum = 0;
            }
            maxsum = Math.max(maxsum, cursum);
        }
        System.out.println("maxsum is: " +maxsum);
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    Kadanes(arr);  
    }
    
}
