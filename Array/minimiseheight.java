public class minimiseheight {
    public static void main(String[] args) {
    // int k = 2;
//    int[] arr= {1, 5, 8, 10};
int[] arr = {3, 9, 12, 16, 20};
int k = 3;
   int n= arr.length;
   for(int i=0; i<n; i++){
    // agar i-k 0 de to add k to i
    if((arr[i]- k )<= 0){
        arr[i] = arr[i] + k;
    }
    else{
        arr[i] = arr[i]-k;
    }
   }
   //first index aur last ko minus kar do
   System.out.println(arr[n-1]-arr[0] );

    }
  
    
}
