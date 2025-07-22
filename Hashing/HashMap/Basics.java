//Are Unordered
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basics {
    public static void main(String[] args) {
        
        HashMap<String, Integer> StudentInfo = new HashMap<>();

        //Insertion
        // //.put => if the key exist to update kar dega if doent exists to it will insert new pair in the list or map
        StudentInfo.put("Anjali", 21 );
        StudentInfo.put("Pushpa", 22 );
        StudentInfo.put("Mannya", 23 );
        StudentInfo.put("Neha", 32 );
        StudentInfo.put("Pramisi", 38);

        // System.out.println(StudentInfo);

        // //update
        // StudentInfo.put("Mannya", 123 );
        // System.out.println(StudentInfo);

        //Search
        // .containskey => if present will give true if not then false
        // if(StudentInfo.containsKey("Mannya")){
        //     System.out.println("Key is Present");
        // }else{
        //     System.out.println("not Present");
        // }

        // Is particular key ki kya value h janna h to we will use get
        // .get => if key exist to will print the corresponding value else it will print null
        // System.out.println(StudentInfo.get("Mannya"));
        // System.out.println(StudentInfo.get("pihu"));

        // int[] arr = {1, 2, 3, 5};
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }
        // System.out.println();

//  entryset is used to access key value both 
        // for(Map.Entry<String, Integer> e :  StudentInfo.entrySet()){
        //     System.out.print(e.getKey() + " ");
        //     System.out.print(e.getValue() + " ");
        //     System.out.println();
        // }

        
        
    //Iteration (2)
       Set<String> keys = StudentInfo.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + StudentInfo.get(key));
       }


    }
    
}
