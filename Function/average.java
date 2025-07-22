//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class average {
   public static double findAvg(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = findAvg(a, b, c);
        System.out.println("Average is: " + avg);
        sc.close();     
    }
}
