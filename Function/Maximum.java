
public class Maximum{
    int Maximum(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main (String[] args){
        Maximum obj = new Maximum(); // create object
        int result = obj.Maximum(4,5);// call using object
        System.out.println(result);
    }
}