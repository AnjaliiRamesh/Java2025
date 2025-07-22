// 4.	Search for an element in the array. Return its index if found, else -1.
// ➤ Input: {4, 6, 8, 10}, search: 8
// ➤ Output: 2

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = sc.nextInt();
        
        //input
        int[] number = new int[size];
        System.out.print("Enter input: ");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // output
        int n = number.length;
        for(int i=0; i<n; i++){
            if(number[i] == target){
                System.out.println("found at index: " +i);
            }
           else{
            System.out.println(-1);
           } 
        }

    }
    
}
