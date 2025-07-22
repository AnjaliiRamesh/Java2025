// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class oddSum {
    //if yaha pe mai static use nhi karti to mujhe main me object banana padta 
    //coz non-static method ko u cant directly call in main method
    public static int sumofodds(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            if(i%2 != 0)
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter val of n: ");
        int n = sc.nextInt();

        int res = sumofodds(n);
        System.out.println("sum is: " +res);
        sc.close();   
    }    
}
