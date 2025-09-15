import java.util.Scanner;

public class Add {
    static int adding(int a, int b) {
        int sum = a + b;
        // return a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Add obj = new Add();
        int sum = adding(a, b);
        System.out.println("sum is: " + sum);
    }
}
