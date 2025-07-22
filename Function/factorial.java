
//In Java, when you create an object, the object must be of the same type as the class name.

public class factorial {
    public static void main(String[] args) {
        factorial obj = new factorial(); // corrected this line
        int result = obj.calculateFact(5); // method call
        System.out.println(result);
    }

    int calculateFact(int num) {
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
