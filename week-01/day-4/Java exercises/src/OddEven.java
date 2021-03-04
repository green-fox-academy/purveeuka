import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        System.out.println("Enter a number please!");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("This number is Even");
        } else {
            System.out.println(" This numbers is Odd");
        }
    }
}