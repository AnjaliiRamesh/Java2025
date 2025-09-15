import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array values: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter value to be updated: ");
        int toupdate = sc.nextInt();
        System.out.print("enter index to be updated: ");
        int atIndex = sc.nextInt();

        if( atIndex >= 0 && atIndex < arr.length){
            arr[atIndex] = toupdate;

            System.out.println("updated arrays are: ");
        for(int i =0; i< arr.length; i++){
             System.out.print(arr[i] + " ");
        }

        }
        else {
            System.out.println("Invalid index! Please enter index between 0 and " + (arr.length - 1));
        }

        sc.close();
        
        
       
    }
    
}
