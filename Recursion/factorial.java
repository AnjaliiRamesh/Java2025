public class factorial {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("factorial of num is: " +res);
    }
    
}
