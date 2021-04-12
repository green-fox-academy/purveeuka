package Exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MostCommonWords {
    public static void main(String[] args) {

        try {
            Map<String, Integer> commonWords = Files.lines(Path.of("src/Text-Files/US-Election-Wiki.txt"))
                    .map(Pattern.compile("\\p{Punct}") :: matcher).map(matcher -> matcher.replaceAll(""))
                    .flatMap(Pattern.compile("\\s+") :: splitAsStream).filter(Pattern.compile("^\\w+$").asPredicate())
                    .filter(w -> w.length() >= 3).map(String::toLowerCase).collect(Collectors.groupingBy(w -> w, Collectors.summingInt(w -> 1)));

            commonWords.entrySet()
                    .stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                    .limit(100).forEach(w -> System.out.println(w.getKey() + ": " + w.getValue()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
Find a random Wikipedia article and copy the contents to a txt file.
Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order.
Keep in mind that the text contains punctuation characters which should be ignored. The result should be something like this:
the: 131
of: 74
and: 48
to: 45
a: 43
in: 43
was: 30
as: 21
German: 18
for: 16
his: 15
by: 13
he: 11
that: 11
 */