import java.util.HashSet;


public class Union {

    public static int FindUnion(int nums1[], int nums2[]){
        HashSet<Integer> map = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i=0; i<n; i++){
            map.add(nums1[i]);
        }
        for(int j=0; j<m; j++){
            map.add(nums2[j]);
        }
        
        return map.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {7,3,9,6,2,4};
        System.out.println(FindUnion(arr1, arr2));
    }
    
}
