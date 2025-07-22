// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 



import java.util.Scanner;

public class NumberCounterForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (;;) {  // Infinite loop
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            char choice = sc.next().charAt(0);

            if (choice != 'y' && choice != 'Y') {
                break; // Exit the loop
            }
        }

        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        sc.close();
    }
}
