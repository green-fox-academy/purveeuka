package recursion;

public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println(numOfEars(10));
    }
    public static int numOfEars( int bunniesInLine) {
        if (bunniesInLine == 0) {
            return 0;
        } else {
            if ( bunniesInLine  % 2 == 0){
                return 2 + numOfEars(bunniesInLine -1);
        } else {
                return 3 + numOfEars(bunniesInLine -1);
            }
        }
    }
}
// We have bunnies standing in a line,
// numbered 1, 2, 3, 4, ...
// The odd bunnies (1, 3, ...) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).
