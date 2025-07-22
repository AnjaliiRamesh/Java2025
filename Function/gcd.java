import java.util.Scanner;

public class gcd {
    static int comdivisor(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int res = comdivisor(a, b);
        System.out.println("GCD is:" +res);
    }
    
}
