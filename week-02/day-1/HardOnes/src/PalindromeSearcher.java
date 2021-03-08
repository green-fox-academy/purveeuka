public class PalindromeSearcher {
    public static void main(String[] args) {
        String original = "door";
        original = original.replace(" ", "");
        searchPalindrome(original);

    }
    public static void searchPalindrome(String text) {
        String reverse = "";
        for(int i = text.length() -1; i >= 0; i--) {
            reverse += text.charAt(i);
            System.out.print(reverse + " ");

        }
        /*
        boolean palindrome = true ;
        for ( int j = 0; j < text.length(); j++) {
            if (text.charAt(j) != reverse.charAt(j)) {
                palindrome = false;
            }
            break;
        }
         */

    }

}
