public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100
        for (int a = 1; a <= 100; a++) {
            // For numbers which are multiples of both three and five print “FizzBuzz”.
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
                // but for multiples of three print “Fizz” instead of the number
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
                // and for the multiples of five print “Buzz”.
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }

    }
}
}
