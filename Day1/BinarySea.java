package Day1;

public class BinarySea {
    public static int BinarySearch (int arr[], int key) {
        int start = 0; 
        int end = arr.length-1;

        while (start<=end) {
            int mid = (start + end )/2;

            if(arr[mid] == key ){
                return mid;
            }

            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key =12;

        System.out.println("binary search implemented key found at index : "+BinarySearch(arr, key));
       
}
}