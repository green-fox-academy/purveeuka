package Exercise12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class StarWars {
    public static void main(String[] args) {
     List<String> lines = readFile();
     List<SwCharacter> swCharacters = lines.stream().map(SwCharacter::new).collect(Collectors.toList());

     //Print the name of the heaviest character (if the mass is unknown, ignore that character)
     Optional<SwCharacter> heaviestCharacter = swCharacters.stream()
             .max(Comparator.comparingInt(SwCharacter::getMass));
     heaviestCharacter.ifPresent(System.out ::println);
     System.out.println("-------------------------------------------------");

     /*
     Print the average height of the male characters
     Print the average height of the female characters
     */
     System.out.println(getAvgHeightOf(swCharacters, "male"));
     System.out.println("-------------------------------------------------");
     System.out.println(getAvgHeightOf(swCharacters, "female"));
     System.out.println("-------------------------------------------------");

     /*
     Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
     The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
     The result should be a Map<String, Map<String, Integer>>
     */

     Map<String, Map<String, Integer>> ageAndGender = swCharacters
             .stream()
             .collect(
                     Collectors.groupingBy(SwCharacter::getGender,
                             Collectors.groupingBy(
                                     (SwCharacter ch) -> ageGroup(ch.getAge()),
                                     Collectors.summingInt(ch -> 1)
                             )
                     )
             );
        System.out.println(ageAndGender);
    }

    public static double getAvgHeightOf(List<SwCharacter> swCharacters, String gender) {
        return swCharacters
                .stream()
                .filter(swCharacter -> swCharacter.getGender().equals(gender))
                .mapToDouble(SwCharacter::getHeight)
                .summaryStatistics()
                .getAverage();
    }

    public static String ageGroup(int age) {
        if (age < 21) {
            return "below 21";
        } else if (age <= 40) {
            return "between 21 and 40";
        } else if (age > 41) {
            return "above 40";
        } else {
            return "unknown";
        }
    }

    private static List<String> readFile(){
        List<String> fileContent = new ArrayList<>();
        Path path = Path.of("src/Text-Files/ swcharacters.csv");
        try {
            fileContent = Files.readAllLines(path);
            fileContent.remove(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent;
    }
}
