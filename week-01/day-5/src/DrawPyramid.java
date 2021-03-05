import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to create Pyramid.");
        int number = scanner.nextInt();
        for (int i = 1; i < (number + 1); i++) {

            for ( int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for ( int j = 0; j < i * 2 - 1; j++) {

                System.out.print("*");


        }
            System.out.println();
    }
}
}
