import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map<String, Integer> letterCounter(String input) {
        Map<String, Integer> letterMap = new HashMap<>();

        for (int letter = 0; letter < input.length(); letter++) {
            if (letterMap.containsKey(input.valueOf(input.charAt(letter)))) {
                int count = letterMap.containsKey(input.valueOf(input.charAt(letter))) ? letterMap.get(input.valueOf(input.charAt(letter))) : 0;
                letterMap.put(input.valueOf(input.charAt(letter)), count + 1);
            } else {
                letterMap.put(input.valueOf(input.charAt(letter)), 1);
            }
        }
        return letterMap;
    }
}
/*
Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
and numbers as values that shows how many occurrences there are.
Create a test for that.
 */