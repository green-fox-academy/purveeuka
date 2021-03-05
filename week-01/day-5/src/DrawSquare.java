import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter only odd numbers to create a Square!");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            int j;
            if ((i == 1) || (i == number)) {
                for (j = 0; j < number; j++) {
                    System.out.print("%");
                }
                System.out.println();
            } else {
                for (j = 0; j < number; j++) {
                    if ((j == 0) || (j == (number - 1))) {
                        System.out.print("%");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}


