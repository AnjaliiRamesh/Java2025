// 5.	Update a specific index with a new value.
// ➤ Input: {1, 2, 3, 4}, update index 2 with 10
// ➤ Output: {1, 2, 10, 4}



import java.util.Scanner;

public class update{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take size of array
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Step 2: Take array elements
        System.out.println("Enter elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Take index and new value
        System.out.print("Enter index you want to update: ");
        int indexToUpdate = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        // Step 4: Update if index is valid
        if(indexToUpdate >= 0 && indexToUpdate < arr.length) {
            arr[indexToUpdate] = newValue;

            // Step 5: Print updated array
            System.out.print("Updated Array: ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid index! Please enter index between 0 and " + (arr.length - 1));
        }

        sc.close();
    }
}

