public class TripletSum {

    // Function to check triplet sum
    public static boolean hasTriplet(int[] arr, int target) {
        int n = arr.length;

        // Try every possible triplet
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return true; // Found triplet
                    }
                }
            }
        }
        return false; // No triplet found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 45, 6, 10, 8};
        int target1 = 13;

        int[] arr2 = {1, 2, 4, 3, 6, 7};
        int target2 = 10;

        int[] arr3 = {40, 20, 10, 3, 6, 7};
        int target3 = 24;

        System.out.println(hasTriplet(arr1, target1)); // true
        System.out.println(hasTriplet(arr2, target2)); // true
        System.out.println(hasTriplet(arr3, target3)); // false
    }
}
