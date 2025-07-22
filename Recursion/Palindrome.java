// public class Palindrome {

//     public static void main(String[] args) {
//         String word = "hello";
//         boolean isPalindrome = true;
//         int left = 0;
//         int right = word.length()-1;
//         while(left<right){
//             if(word.charAt(left) != word.charAt(right)){
//                 isPalindrome = false;
//                 break;
//             }
//             left++;
//             right--;
//         }
//         System.out.println("is Palindrome? : " +isPalindrome);

//     }
    
// }
public class Palindrome {

    public static boolean isPalindrome(String str, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // If characters at current positions don't match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call: move inwards
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String word = "madam";
        boolean result = isPalindrome(word, 0, word.length() - 1);
        System.out.println("Is Palindrome? " + result);
    }
}
