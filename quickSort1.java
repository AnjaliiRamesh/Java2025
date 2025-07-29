
import java.util.Arrays;

public class quickSort1{

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int index = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                index++;
                // swap arr[index] and arr[j]
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at the right position
        index++;
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 31, 35, 8, 32, 17};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
