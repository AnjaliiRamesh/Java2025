import java.util.*;

public class MoreThanNbyK {
    public static int countOccurences(int[] arr, int k) {
        int n = arr.length;
        int freqCount = 0;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Traverse and count frequencies
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count > n / k) {
                    freqCount++;
                }
                count = 1; // reset
            }
        }
        // Check for last element’s frequency
        if (count > n / k) {
            freqCount++;
        }

        return freqCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        System.out.println(countOccurences(arr, k)); // Output: 2
    }
}
