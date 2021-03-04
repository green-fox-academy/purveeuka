import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please enter 5 numbers!");
        int num1 = numbers.nextInt();
        int num2 = numbers.nextInt();
        int num3 = numbers.nextInt();
        int num4 = numbers.nextInt();
        int num5 = numbers.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = (double) sum / 5;

        System.out.println("Sum of the numbers- " + sum);
        System.out.println("Average- " + average);
    }

}
