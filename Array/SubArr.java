public class SubArr {

    public static void PrintSubArray(int arr[]){
        int ts = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
          for(int j=i; j<n; j++){
            for(int k=i; k<=j; k++){
                System.out.print(arr[k] +" ");
            }
            ts++;
            System.out.println();
          }
          System.out.println();
        }
        System.out.println("Total number of sbuarrays are: " +ts);
       
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
       PrintSubArray(arr);
    }
}
