package recursion;

public class StringsAgainAndAgain {
    public static void main(String[] args) {
        System.out.println(adjacent("Hello there!", "Hello there!".length()));
    }

    public static String adjacent( String string, int length){
        if (length > 1) {
            string = string.substring(0,length - 1) + "*" + string.substring(length - 1);
            return adjacent(string, length - 1);
        }
        return string;
    }
}
// Given a string,
// compute recursively a new string where
// all the adjacent chars are now separated by a `*`