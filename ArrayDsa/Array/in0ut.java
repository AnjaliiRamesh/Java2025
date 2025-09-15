import java.util.Scanner;

public class in0ut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sixe: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];  // ✅ use [] with int for array

        // Fix: i < size instead of i <= size
        System.out.print("Enter input: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter target x: ");
        int x = sc.nextInt();

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }

        sc.close(); // good habit to close scanner
    }
}

