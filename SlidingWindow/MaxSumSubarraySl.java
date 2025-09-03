package SlidingWindow;

public class MaxSumSubarraySl {

    // Function to find maximum sum subarray of size k
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        // Loop for subarray starting points
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;

            // Calculate sum of subarray of size k
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            // Update maxSum
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 200, 300, 400};
        int k1 = 2;
        System.out.println(maxSumSubarray(arr1, k1)); // 700

        int[] arr2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k2 = 4;
        System.out.println(maxSumSubarray(arr2, k2)); // 39

        int[] arr3 = {100, 200, 300, 400};
        int k3 = 1;
        System.out.println(maxSumSubarray(arr3, k3)); // 400
    }
}


  