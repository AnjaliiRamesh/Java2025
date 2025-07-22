
import java.util.*;
import java.util.Iterator;

//Hashsets are ususally unordered

public class Basic {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println("size of set is: " +set.size());
        //print all elements
        System.out.println("elemnts of set are: " +set);

        //Search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("doesnot conatin six");
        }

        //deletion
       set.remove(1);
       if(!set.contains(1)){
        System.out.println("we deleted 1");
       }



       //Iterator- is used to traverse the array elements
       //hasNext -> tells whether the next element exists or ot
       //next -> it prints the next elemnet

       Iterator it = set.iterator();

       while(it.hasNext()){//print untill hasnext is true . hasnext will be true till it has element 
        System.out.println(it.next());
       }

      
    }

    

}
