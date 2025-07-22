

public class First {

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int mini = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            // Swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


