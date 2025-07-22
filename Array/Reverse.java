 // 6.	Reverse the array.
// ➤ Input: {1, 2, 3, 4, 5}
// ➤ Output: {5, 4, 3, 2, 1}

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed array is: ");
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
