// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.Scanner;

public class powerof {

    public static int CalculatePower(int x, int n){
       int pow = 1;
       for(int i=1; i<=n; i++){
          pow = pow*x;
       }
       return pow;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter x: ");
       int x = sc.nextInt();
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       
       int res = CalculatePower(x, n);
       System.out.println("power is: " +res);
       sc.close();
    }
    
}
