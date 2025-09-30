import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        
        // String name = "Anjali";
        // String fullName = "Anjali Gupta";
        // String sentence = "my name is Anjali Gupta";
        // System.out.println(name);
        // System.out.println(fullName);
        // System.out.println(sentence);

        //TAKING INPUT
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("your name is: "+name);

        // String name1 = sc.nextLine();
        // System.out.print("your name is: "+name1);

        //CONCATENATION  
        // String firstName = "Anjali";
        // String secondName = "Gupta";
        // String fullName = firstName + " " + secondName;
        // System.out.println(fullName.length());

        //CHARAT
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //compareto
        // String name1 = "Anjali";
        // String name2 = "Anjali";
        // String name1 = "Anjali";
        // String name2 = "Pnjali";
         String name1 = "Pnjali";
        String name2 = "Anjali";
        //s1>s2 = +ve
        //s1=s2 = 0
        //s1<s2 = -ve

        if(name1.compareTo(name2) ==0){
            System.out.println("equal");
        }
        if(name1.compareTo(name2) == -1){
            System.out.println("name1 is smaller");
        }
        else{
            System.out.println("name 1 is greater");
        }

    }
    
}
