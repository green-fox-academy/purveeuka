
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {

    static Anagram anagram;

    @BeforeEach
    public  void init() {
        anagram = new Anagram();
    }

    @Test
    public void shouldReturnTrueWhenSameWordWithMoreSpaces() {
        String word1 = "g o d";
        String word2 = "god";
        assertTrue(anagram.isAnagram(word1, word2));
    }

    @Test
    public void shouldReturnTrueWhenSameWordWithUppercase() {
        String word1 = "GOD";
        String word2  = "god";
        assertTrue(anagram.isAnagram(word1, word2));
    }

    @Test
    public void shouldReturnFalseWhenSameWordWithEmptyString() {
        String word1 = "";
        String word2 = "";
        assertTrue(anagram.isAnagram(word1, word2));
    }

    @Test
    public void shouldReturnTrueWhenSameWordWithNumbers() {
        String word1 = "982 516";
        String word2  = "615 892";
        assertTrue(anagram.isAnagram(word1, word2));
    }

    @Test
    public void shouldReturnTrueWhenSameWordWithSpecialCharacter() {
        String word1 = "God:";
        String word2  = ":god";
        assertTrue(anagram.isAnagram(word1, word2));
    }
}