public class PrintNnum {
    public static void PrintN(int i,  int n){
         if (i > n) return;

        // Print the current number
        System.out.println(i);

        // Recursive call
        PrintN(i + 1, n);
    }
     public static void main(String[] args) {
        int n = 5;
        PrintN(1, n);
    }
    
}
