package recursion;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int aNum = 6;
        int bNum = 4;
        System.out.println("The greatest common divisor of " + aNum + " and " + bNum + " is "+ gcd(aNum, bNum) + ".");
    }
    public static int gcd ( int aNum, int bNum) {
        if (aNum == 0) {
            return bNum;
        }
        if (bNum == 0) {
            return aNum;
        }
        if (aNum > bNum) {
            return gcd(aNum - bNum, bNum);
        }
        return gcd(aNum, bNum - aNum);
    }
}
// Find the greatest common divisor of two numbers using recursion.