
public class Add{
    int adding(int a,int b){
        return a+b;
    }

    public static void main (String[] args){
        Add obj = new Add(); // create object
        int result = obj.adding(3, 5); // call using object
        System.out.println(result);
    }
}