// Create a program that asks for two numbers
import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println(" Please enter two numbers!");
        Scanner numbers = new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        if (a > b) {
            System.out.println("The second number should be bigger than the first one!");
        }
        // If it is bigger it should count from the first number to the second by one
        do {
            System.out.println(a);
            a++;
        } while (b > a);

    }
}
