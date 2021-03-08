public class Doubling {
    static int doubleNumber(int i) {
        return i * 2;
    }

    public static void main(String[] args) {
        int baseNumber = 123;
        int Square = doubleNumber(baseNumber);
        System.out.println(Square);

    }


    }
    // - Create an integer variable named `baseNumber` and assign the value `123` to it
    // - Create a function called `doubleNumber()` that doubles its integer input parameter
    //   and returns the doubled value
    // - Print the result of `doubleNumber(baseNumber)`