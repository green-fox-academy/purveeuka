package recursion;

public class Strings {
    public static void main(String[] args) {
        String changedChars = "xXxxX";
        System.out.println(changedChars(changedChars));
    }

    public static String  changedChars(String string) {
        if (string.length() == 0) {
            return string;
        } else if (string.charAt(0) == 'x'){
            return 'y' + changedChars(string.substring(1));
        }
        else {
            return string.charAt(0) + changedChars(string.substring(1));
        }
    }
}
// Given a string, compute recursively (no loops) a new string where
// all the lowercase 'x' chars have been changed to 'y' chars.