public class subarray {
    public static void main(String[] args) {
        int n = 5;
        // int[] arr = {1,2,3,4,5};
        int[] arr = {3, -4, 5, 4, -1, 7, -8};
        for(int st=0; st<n; st++){
            for(int end = st; end<n; end++){
                for(int i=st; i<=end; i++){
                System.out.print(arr[i]);

                }
            System.out.print(" ");

            }
        System.out.println();


        }
    }
}
    

