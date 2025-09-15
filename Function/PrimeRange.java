public class PrimeRange {

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
    public static void PrimeinRange(int n){
        for(int i=2; i<=n ; i++){
            if(PrimeNum(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args){
    //    System.out.println(PrimeNum(5));
    //    System.out.println(PrimeNum(12));
    // PrimeinRange(5);
    PrimeinRange(20);


      
    }
}