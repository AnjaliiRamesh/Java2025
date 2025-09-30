package BinarySearch;
    class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // to avoid overflow

            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 15, 20};
        int target = 10;
        int result = search(arr, target);
        System.out.println("Target found at index: " + result);
    }
}

    

