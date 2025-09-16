// 3.	Find the average of elements in an array.
// ➤ Input: {10, 20, 30}
// ➤ Output: 20



// import java.util.Scanner;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];  // ✅ use [] with int for array

        System.out.print("Enter input: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        int avg = sum/size;
        System.out.println("Average is: " +avg);
    }
}