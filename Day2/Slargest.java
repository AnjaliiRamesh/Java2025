 package Day2;

class Slargest {

    public static int printSlar(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i] <largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
         return slargest == Integer.MIN_VALUE ? -1 : slargest;
    }
     public static void main(String[] args) {
        
        // int arr[] = {12, 35, 1, 10, 34, 1};
        int arr[] = {10, 10, 10};
      
       System.out.println("slargest element: "+ printSlar(arr));
     }
}