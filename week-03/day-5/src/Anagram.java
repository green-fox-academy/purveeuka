import java.util.Arrays;

public class Anagram {
    public Anagram(){
    }

    public boolean isAnagram(String word1, String word2) {

        return (orderedInput(word1).equals(orderedInput(word2)));
    }

    public static String orderedInput(String input) {
        String orderedInputString;
        char[] charArray = spaceRemover(input).toLowerCase().toCharArray();
        Arrays.sort(charArray);
        orderedInputString = new String(charArray);
        return orderedInputString;
    }

    public static String spaceRemover(String input) {
        String removedSpaces = "";

        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) == 32) {
            } else {
                removedSpaces = removedSpaces + input.valueOf(input.charAt(i));
            }
        }
        return removedSpaces;
    }
}
/*
    Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
        Create a test for that.
 */