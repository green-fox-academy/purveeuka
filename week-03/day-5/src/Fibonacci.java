public class Fibonacci {

    public int fibonacci(int n) {

        if ( n >= 0 && n < 50) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
        } else if(n < 0) {
            System.out.println("Please enter positive and whole number!");
            return 0;
        } else {
            System.out.println("The calculated fibonacci number was bigger then the limit.");
            return 0;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
/*
    Write a function that computes a member of the fibonacci sequence by a given index
        Create tests for multiple test cases.
 */