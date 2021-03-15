import java.util.Arrays;

public class MaxSum {
    public static void main(String[] args) {
        int[] numArray = {5, 2, 4, 3, 1};
        System.out.println(maxSum(numArray, numArray.length));
    }

    public static int maxSum(int[] array, int numbers){
        Arrays.sort(array);
        if(numbers <= 1) {
            return 0;
        }
        return (maxSum(array , numbers - 1) + array[numbers - 1]);
    }
}
// Create a function called `maxSum` which
// expects an array of five integers as an input parameter and
// returns the maximum values that can be
// calculated by summing exactly four of the five integers.
//
// Examples
//
// [1 2 3 4 5] -> 14
//
// We can calculate the following sums using four of the five integers:
//
// 1 + 2 + 3 + 4 = 10
// 1 + 2 + 3 + 5 = 11
// 1 + 2 + 4 + 5 = 12
// 1 + 3 + 4 + 5 = 13
// 2 + 3 + 4 + 5 = 14
