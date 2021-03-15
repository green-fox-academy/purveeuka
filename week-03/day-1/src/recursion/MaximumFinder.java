package recursion;

public class MaximumFinder {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 60, 50};
        int numbers = array.length;
        System.out.println(findLargest(array, numbers));
    }
    public static int findLargest(int[] arr, int number){
        if (number == 1) {
            return arr[0];
        }
        return Math.max(arr[number - 1], findLargest(arr, number - 1));
    }
}
// Write a function that finds the largest element of an array using recursion.