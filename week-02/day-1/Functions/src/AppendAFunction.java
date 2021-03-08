public class AppendAFunction {
    static String appendA( String text) {
        return text + "a";
    }
    public static void main(String[] args) {
        String typo = "Chinchill";
        System.out.println(appendA(typo));

    }
}
//  Create the usual class wrapper and main method on your own

// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendA()` that gets a string as an input,
//   appends an 'a' character to its end and returns the modified string
//
// - Print the result of `appendA(typo)`