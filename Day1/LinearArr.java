package Day1;

public class LinearArr {
    public static int LinearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int numbers[] = {1, 4, 5, 6, 7, 90, 12};
        int key = 6;
        int index = LinearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("found at index "+index);
        }
    }
}
