public class oddEven {

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 7;
        boolean result = isEven(number);
        System.out.println("Is the number even? " + result);
    }
}


//
public class oddEven {
    boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        oddEven obj = new oddEven();
        boolean result = obj.isEven(4);  
        System.out.println(result);
    }
}
