public class sort0s1s2s {
    public static void main(String[] args) {
    int[] arr = {0, 1, 2, 0, 1, 2};
    int low = 0, mid = 0, high = arr.length - 1;

    while (mid <= high) {
        switch (arr[mid]) {
            case 0:
                // swap arr[low] and arr[mid], move both forward
                int temp0 = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp0;
                low++;
                mid++;
                break;
            case 1:
                // leave it as is
                mid++;
                break;
            case 2:
                // swap arr[mid] and arr[high], move high backward
                int temp2 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp2;
                high--;
                break;
        }
    }

    // print result
    for (int num : arr) {
        System.out.print(num + " ");
    }
}

    
}
/*Intuition
The problem here involves sorting an array containing only 0s, 1s, and 2s. Instead of using standard sorting algorithms (like quicksort or mergesort), we can take advantage of the fact that the array only has three unique values. This enables us to use a more efficient approach called the Dutch National Flag Algorithm, proposed by Edsger W. Dijkstra. This algorithm processes the array in a single pass (O(n) time complexity) by maintaining three pointers to segregate 0s, 1s, and 2s.

Approach
The algorithm maintains three pointers:

low: marks the boundary for 0s (elements before low are all 0).
mid: is used to traverse the array.
high: marks the boundary for 2s (elements after high are all 2).
As we traverse the array:

If the element at mid is 0, we swap it with the element at low and increment both low and mid pointers.
If the element at mid is 1, we simply move mid to the next element.
If the element at mid is 2, we swap it with the element at high and decrement high (without moving mid because the swapped element might need further processing).
This way, we can sort the array in one linear pass without using extra space.

Steps
1.Initialize three pointers:
low = 0: marks the boundary for 0s.
mid = 0: starts the traversal.
high = n - 1: marks the boundary for 2s.
2.Traverse the array:
If arr[mid] == 0: Swap arr[mid] with arr[low], and increment both low and mid.
If arr[mid] == 1: Simply move mid forward.
If arr[mid] == 2: Swap arr[mid] with arr[high], and decrement high.
3.Continue the process until mid surpasses high.


Time and Space Complexity
Time Complexity:
The algorithm traverses the array once, making it O(n) where n is the length of the array.
Space Complexity:
The algorithm uses a constant amount of extra space, so the space complexity is O(1).


Key Takeaways
Dutch National Flag Algorithm is perfect for sorting arrays with only three unique elements in linear time.
Two-pointer technique is employed to manage the 0 and 2 boundaries, ensuring the array is sorted efficiently.
The algorithm is in-place, meaning no extra array or significant memory is needed
*/
