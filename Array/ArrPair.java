package Array;

public class ArrPair {

    public static void PrintPairs(int arr[]) {{
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j = i+1; j<arr.length; j++){
                System.out.print("(" + curr + "," + arr[i] + ") ");
            }
            System.out.println();
        }
        
    }
    
        
    }
    public static void main(String[] args) {
        int arr[] = {2,3, 4, 6, 8};
        PrintPairs(arr);

    }
}
