package recursion;

public class StringsAgain {
    public static void main(String[] args) {
        System.out.println(removeX("Hxappy birthxday tox youx!"));

    }
    private static String removeX (String string) {
        if (string.contains("x")) {
            return removeX(string.replaceFirst("x",""));
        } return string;
    }
}
// Given a string,
// compute recursively a new string where
// all the 'x' chars have been removed.