package Array;

public class MaxSumArr {
    public static void PrintMaxSubArr(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
          int start = i;
          for(int j=i; j<n; j++){
            int end = j;
            int currSum = 0;
            for(int k=start; k<=end; k++){
              currSum += arr[k];
            }
            System.out.println(currSum);
            if(currSum > MaxSum){
                MaxSum = currSum;
            }
    } 
    }
    System.out.println("Maxim Subarr: " +MaxSum);
    
       
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
     PrintMaxSubArr(arr);  
    }
}
