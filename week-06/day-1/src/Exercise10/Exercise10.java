package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
        Fox Jack = new Fox("Jack", "green", 2);
        Fox Jane = new Fox("Jane", "red", 3);
        Fox Foxy = new Fox("Foxy", "yellow", 1);
        Fox Pixie = new Fox("Pixie", "green", 6);

        List<Fox> foxes = new ArrayList<>();
        foxes.add(Jack);
        foxes.add(Jane);
        foxes.add(Foxy);
        foxes.add(Pixie);

        foxes.stream()
                .filter(fox -> fox.getColor().equals("green"))
                .forEach(fox -> System.out.println(fox.getName()));
        System.out.println("-------------------------------------------");

        foxes.stream()
                .filter(fox -> fox.getColor().equals("green") && fox.getAge() < 5)
                .forEach(fox -> System.out.println(fox.getName()));
        System.out.println("-------------------------------------------");

        Map<String, Long> countColors = foxes.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));
        System.out.println(countColors);
    }
}
/*
Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

Write a Stream Expression to find the foxes with green color!
Write a Stream Expression to find the foxes with green color, and age less then 5 years!
Write a Stream Expression to find the frequency of foxes by color!

 */