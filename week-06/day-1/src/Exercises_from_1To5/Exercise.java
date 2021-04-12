package Exercises_from_1To5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        // Ex1. Write a Stream Expression to get the even numbers from the following list:
        numbers1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("--------------------------------------------");

        // Ex2. Write a Stream Expression to get the squared value of the positive numbers from the following list:

        List<Integer> positiveNums = numbers1.stream().filter(n -> n > 0).map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(positiveNums);
        System.out.println("--------------------------------------------");

        //Ex3. Write a Stream Expression to find which number squared value is more then 20 from the following list:
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers2.stream().filter(num -> num * num > 20).forEach(System.out::println);
        System.out.println("--------------------------------------------");

        //Ex4. Write a Stream Expression to get the average value of the odd numbers from the following list:numbers1
        numbers1.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).average().ifPresent(System.out::println);
        System.out.println("--------------------------------------------");

        //Ex5. Write a Stream Expression to get the sum of the odd numbers in the following list:
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int sumOfOdds = numbers3.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).sum();
        System.out.println(sumOfOdds);
        System.out.println("--------------------------------------------");
    }
}
