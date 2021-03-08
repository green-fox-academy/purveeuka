public class Factorial {
    static int factorial = 1;

    static int calculateFactorial(int n){
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));

    }
}
//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input