package recursion;

public class Bunnies {
    public static void main(String[] args) {
        System.out.println(totalEars(10));
    }
    public static int totalEars(int bunnies){
        if (bunnies == 0){
            return 0;
        } else {
            return 2 + totalEars(bunnies - 1);
        }
    }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears
// across all the bunnies recursively (without loops or multiplication).