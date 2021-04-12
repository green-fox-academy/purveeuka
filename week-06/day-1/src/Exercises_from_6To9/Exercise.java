package Exercises_from_6To9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        //Ex6. Write a Stream Expression to find the uppercase characters in a string!
        String word = "HelLo WoRlD";
        word.chars().filter(Character::isUpperCase).mapToObj(c -> Character.toString((char) c))
                .forEach(System.out :: println);
        System.out.println("--------------------------------------------");

        //Ex7. Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA",
                "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        System.out.println(startingCharacter("A",cities));
        System.out.println("--------------------------------------------");

        //Ex8. Write a Stream Expression to concatenate a Character list to a string!
        List<Character> chars = Arrays.asList('H', 'e', 'l', 'l', 'o');
        System.out.println(buildString(chars));
        System.out.println("--------------------------------------------");

        //Ex9. Write a Stream Expression to find the frequency of characters in a given string!
        String example = "Hello World, Hi there";

        Map<String , Long> countLetter = Arrays.stream(example.replaceAll(" ","").split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(countLetter);

    }

    private static String buildString(List<Character> chars) {
        return chars.stream().map(c -> c.toString()).collect(Collectors.joining());
    }

    private static List<String> startingCharacter(String input, List<String> cities) {
        return cities.stream().filter(w -> w.startsWith(input)).collect(Collectors.toList());
    }
}

