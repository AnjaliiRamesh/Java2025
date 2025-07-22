    
import java.util.*;
public class ArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Anjali");
        names.add("Riya");
        names.add("Neha");

        System.out.println(names);        // [Anjali, Riya, Neha]
        System.out.println(names.get(0)); // Anjali
    }
}
//What is it??
// ArrayList is a resizable array.
// You can keep adding or removing items, and it adjusts the size for you behind the scenes.


//Use it when:
// You don’t know how many elements you'll have
// You need to add/remove elements easily
// You want to store and access things in order

// Example
// Think of an array as a thali with 5 fixed bowls.
// You can't add an extra bowl after it's made.
// But ArrayList is like a buffet plate — you can keep adding items, no fixed size 😄



