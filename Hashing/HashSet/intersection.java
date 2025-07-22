import java.util.HashSet;

public class intersection {

    public static int FindInter(int nums1[], int nums2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        int n = nums1.length;
        int m = nums2.length;
        for(int i=0; i<n; i++){
            set.add(nums1[i]);
        }
        for(int j=0; j<m; j++){
           if(set.contains(nums2[j])){
            count++;
            set.remove(nums2[j]);
           } 
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {8,3,9,6,2,4};
        System.out.println(FindInter(arr1, arr2));
    }
    
}
