import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";

        System.out.println(anagramCheck(str1, str2));
    }

    public static boolean anagramCheck(String str1, String str2){
        char[] characters1 = str1.toCharArray();
        char[] characters2 = str2.toCharArray();

        Arrays.sort(characters1);
        Arrays.sort(characters2);

        return Arrays.equals(characters1, characters2);
    }
}
