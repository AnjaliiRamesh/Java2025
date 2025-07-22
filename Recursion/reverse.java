public class reverse {

    public static void PrintRev(int n){
        if(n==0){
            return  ;
        }
        
        System.out.println(n);
        PrintRev( n-1);
    }
    public static void main(String[] args) {
        PrintRev(5);
        
    }
    
}
