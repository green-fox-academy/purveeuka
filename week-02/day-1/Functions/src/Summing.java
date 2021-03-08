public class Summing {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }
    static int sum(int i) {
        int sum = 0;
        for (int presum = 0; presum <= i; presum++) {
            sum += presum;
        }
        return sum;
    }

}
// Create the usual class wrapper and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter