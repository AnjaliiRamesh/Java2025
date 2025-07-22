
// HashSet<E> = Only unique elements (no duplicates)
// It just stores elements — no key-value pairing


package Hashing.HashSet;
import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4};

        Set<Integer> set = new HashSet<>();

        for (int val : arr) {
            set.add(val);
        }

        System.out.println(set);
    }
}

    
