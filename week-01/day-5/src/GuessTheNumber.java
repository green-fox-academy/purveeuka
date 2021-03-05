import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int rand1 = rand.nextInt(10);

        System.out.println("Guess the number between 0 and 9: ");
        int number = scanner.nextInt();
        while (!(rand1 == number)) {
            if (rand1 < number) {
                System.out.println("The stored number is less than your number");
            } else {
                System.out.println("The stored number is greater than your number");
            }
            System.out.println("Guess the number between 0 and 9: ");
            number = scanner.nextInt();
        }
        System.out.println("You found the number: " + rand1);

    }
}
