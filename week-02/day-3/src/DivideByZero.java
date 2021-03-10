import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Please enter divisor of number 10!");
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int result = 0;
        Divider(divisor,result);
    }

    public static int Divider(int divisor, int result) {
        try {
            result = 10 / divisor;
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
        return result;
    }
}
// Create a function that divides number 10
// by a number that's passed as a paramater and prints the result.
// It should print "fail" if the parameter is 0

