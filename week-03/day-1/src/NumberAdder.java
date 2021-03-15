public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(numAdder(6));
    }

    public static int numAdder(int n) {
        if( n == 1) {
            return n;
        }
        return numAdder(n-1) + n;
    }
}

// Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.
