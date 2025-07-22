
public class isPrime{
    public static void main(String[] args){
       
       int n = 4;
       int count = 0;
       for(int i=1; i<=n; i++){
        if(n%i==0){
            count = count++;
        } 
       }
       if(count == 2){
        System.out.println("is Prime");
       }
       else{
        System.out.println("not Prime");
       }
    }
}