import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("How many miles?");
        Scanner input = new Scanner(System.in);
        double miles = input.nextDouble();
        double km = miles * 1.60934;
        System.out.println("That is " + String.format("%.2f", km) + " kilometres.");

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

    }

}
