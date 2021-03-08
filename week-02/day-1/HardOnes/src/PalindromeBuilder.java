public class PalindromeBuilder {
    public static void main(String[] args) {
        String original = "green fox";
        original = original.replace(" ", "");
        String palindrome = createPalindrome(original);
        System.out.println(palindrome);
    }
    public static String createPalindrome(String original){
        String result = original;
        for(int reversed = original.length() -1; reversed >= 0; reversed--) {
           result += original.charAt(reversed) ;
        }
        return result;
    }
}
