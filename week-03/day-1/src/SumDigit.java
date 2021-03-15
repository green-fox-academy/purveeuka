public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));
    }
    public static int sumOfDigit (int number) {
        if (number == 0) {
            return 0;
        } else return (number % 10 + sumOfDigit(number / 10));
    }

}
// Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).