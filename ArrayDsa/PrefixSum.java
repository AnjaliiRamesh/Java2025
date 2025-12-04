public class PrefixSum {
    
    public static void PrintMaxSubArr(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i< prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<n; i++){
          int start = i;
          for(int j=i; j<n; j++){
            int end = j;
            //start-1 mtlb neg index ho jata h isliye condition laga diya ki agar start 0 pe h to prefix end ko pakad lena
            int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            if(currSum > MaxSum){
                MaxSum = currSum;
          }
    } 
    }
    System.out.println("Maxim Subarr: " +MaxSum);   
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
     PrintMaxSubArr(arr);  
    }
}

    

