// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Please enter 2 numbers!");
        Scanner numbers = new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        if ( a > b) {
            System.out.println(a  + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Numbers are equal");
        }

    }

}
