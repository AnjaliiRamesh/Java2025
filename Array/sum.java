// 2.	Find the sum of all elements in an array. Input: {1, 2, 3, 4} Output: 10

import java.util.Scanner;

public class sum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    int sum = 0;
    for(int i=0; i<=n; i++){
       sum = sum + i;
    }
    System.out.println("sum of n nums are: " +sum);

   } 
}
