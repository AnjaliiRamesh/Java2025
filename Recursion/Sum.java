public class Sum {
    public static int PrintSum(int n){
        if(n==0){
            return 0;
        }
        return n+PrintSum(n-1);

    }
    public static void main(String[] args) {
        int sum = PrintSum(5);
        System.out.println("sum of n natural numver is: " +sum);
    }
    
}
