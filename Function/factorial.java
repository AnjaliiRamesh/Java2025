
//In Java, when you create an object, the object must be of the same type as the class name.

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        // factorial obj = new factorial(); // corrected this line
        // int result = obj.calculateFact(5); // method call
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int result =  calculateFact(fact); // method call
        System.out.println(result);
    }

    static int calculateFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *=  i;
        }
        return fact;
    }
}
