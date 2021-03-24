import CharSequence.*;

public class CharSequenceMain {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.charAt(2));
        System.out.println("-----------------------------------");

        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.charAt(0));
    }
}
