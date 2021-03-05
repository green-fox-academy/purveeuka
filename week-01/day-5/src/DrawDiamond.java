import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter only odd numbers to create a Diamond!");
        int number = scanner.nextInt();
        while (number % 2 == 0) {
            System.out.println("Sorry, the number is even. Please enter an 'odd' number: ");
            number = scanner.nextInt();
        }
        for (int i = 1; i <= number; i += 2) {
            int Spaces;
            int j;
            for (Spaces = 1; Spaces <= (number - i) / 2; Spaces++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (Spaces = 1; Spaces <= (number - i) / 2; Spaces++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = number - 2; i >= 1; i -= 2) {
            int Spaces;
            int j;
            for (Spaces = 1; Spaces <= (number - 2 - i) / 2 + 1; Spaces++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (Spaces = 1; Spaces <= (number - 2 - i) / 2; Spaces++) {
                System.out.print(" ");
            }
            System.out.println();
    }

}
}


