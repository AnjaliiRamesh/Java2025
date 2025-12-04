import java.util.*;


public class insertion {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 180);
        map.put("China", 130);
        map.put("America", 150);


        System.out.println(map);
        map.put("America", 250);
        System.out.println(map);

        //search
        // if(map.containsKey("India")){
        //     System.out.println("key is present");
        // }else{
        //     System.out.println("key is not present");
        // }

        // get value for existing key
        // System.out.println(map.get("India"));
        // System.out.println(map.get("Europe"));


        // Iteration

        // int arr[] = {12, 15, 18};
        // for(int i=0; i<3; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();

        // ✔️ entrySet() returns both key and value together as a pair (called Map.Entry).
        // 🟢 You don't have to do map.get(key) again
        // 🟢 It gives key + value in one object
        // 🟢 More efficient (faster)

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // ✔️ keySet() returns only the keys of the map.
        // By doing map.get(key): we get values from keySet

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("US");
        System.out.println(map);
    } 
}
