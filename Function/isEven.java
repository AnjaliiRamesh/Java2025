
public class isEven {

    static boolean checkEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 6;
        boolean result = checkEven(number);
        System.out.println("Is the number even? " + result);
    }
}