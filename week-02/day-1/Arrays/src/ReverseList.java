public class ReverseList {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        for ( int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");

        for ( int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");

    }


}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`