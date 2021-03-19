import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {

    CountLetters countLetters;

    @BeforeEach
    public void init() {

        countLetters = new CountLetters();
    }

    @Test
    public void shouldReturnSameHashMap() {
        Map<String, Integer> letterMap = new HashMap<>();
        String input = "happy";
        letterMap.put("h",1);
        letterMap.put("a",1);
        letterMap.put("p",2);
        letterMap.put("y",1);
        assertEquals(letterMap, countLetters.letterCounter(input));
    }

    @Test
    public void shouldReturnSameSize() {
        Map<String, Integer> letterMap = new HashMap<>();
        String input = "happily";
        letterMap.put("h",1);
        letterMap.put("a",1);
        letterMap.put("p",1);
        letterMap.put("p",1);
        letterMap.put("i",1);
        letterMap.put("l",1);
        letterMap.put("y",1);
        assertEquals(letterMap.size(), countLetters.letterCounter(input).size());
    }

    @Test
    public void shouldBeSameWithSpecialCharacters() {
        Map<String, Integer> letterMap = new HashMap<>();
        String input = "_=:;@=";
        letterMap.put("_",1);
        letterMap.put("=",2);
        letterMap.put(":",1);
        letterMap.put(";",1);
        letterMap.put("@",1);
        assertEquals(letterMap, countLetters.letterCounter(input));
    }

    @Test
    public void shouldBeSameWithEmptyHashmap() {
        Map<String, Integer> letterMap = new HashMap<>();
        String input = "";
        assertEquals(letterMap, countLetters.letterCounter(input));
    }

    @Test
    public void shouldBeSameWithSpacesInTheText() {
        Map<String, Integer> letterMap = new HashMap<>();
        String input = "ab ab ab";
        letterMap.put("a",3);
        letterMap.put("b",3);
        letterMap.put(" ",2);
        assertEquals(letterMap, countLetters.letterCounter(input));
    }

    @Test
    public void shouldBeSameWithCapitalLetters() {
        Map<String, Integer> letterMap = new HashMap<>();
        String input = "ab Ab ab";
        letterMap.put("a",2);
        letterMap.put("b",3);
        letterMap.put(" ",2);
        letterMap.put("A",1);
        assertEquals(letterMap, countLetters.letterCounter(input));
    }
}