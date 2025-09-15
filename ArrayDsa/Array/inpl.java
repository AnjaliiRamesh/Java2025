import java.util.Scanner;

public class inpl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Step 2: Take array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Reverse the array in-place
        int start = 0;
        int end = size - 1;

        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Step 4: Print reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
