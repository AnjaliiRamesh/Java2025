import java.util.HashSet;

public class ComArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80} ;
        int[] arr2 = {6, 5, 20, 80, 100};
        int[] arr3 = {3, 5, 15, 20, 30, 70, 80, 120};
        HashSet<Integer> set = new HashSet<>();

        int count =0;
        for(int i=0;i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
            count++;
            set.remove(arr2[j]);
            }
        }
        for(int k=0; k<arr3.length; k++){
            if(set.contains(arr3[k])){
            count++;
            set.remove(arr3[k]);
            }
        }
        System.out.println(count);

    }

}
