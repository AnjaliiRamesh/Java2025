import java.math.*;
import java.util.*;
public class MaxSubArry {
    
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,3,4,5};
        // int[] arr = {3, -4, 5, 4, -1, 7, -8};
        int maxsum = Integer.MIN_VALUE;
        for(int st=0; st<n; st++){
            int currsum = 0;
            for(int end = st; end<n; end++){
                    currsum = currsum + arr[end];
                   maxsum = Math.max(currsum, maxsum);
                }
            }
       System.out.println(maxsum);


        }
    }

    


    

