
public class isPrime{

    // public static boolean PrimeNum( int n){
    //     //edge case 
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i = 2; i<=n-1; i++){
    //         if(n%2==0){
    //             return false;
    //         }
    //     }
    //     return  true;

    // }
     public static boolean PrimeNum( int n){
        //edge case 
        if(n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%2==0){
                return false;
            }
        }
        return  true;

    }
    public static void main(String[] args){
       System.out.println(PrimeNum(5));
       System.out.println(PrimeNum(12));

      
    }
}