// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;
public class circle {

    static double AreaCircum(int r){
          return(2*3.14*r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter radius: ");
         int r = sc.nextInt();
         double res = AreaCircum(r);
        System.out.println("circumference of a circle is: " +res);
    }
}
