package CharSequence;

public class ShiftedCharSequence implements CharSequence {
    private String string;
    private int numOfCharToShift;

    public ShiftedCharSequence(String string, int numOfCharToShift) {
        this.string = string;
        this.numOfCharToShift = numOfCharToShift;
    }

    @Override
    public int length() {
        return this.length() * 2;
    }

    @Override
    public char charAt(int index) {
        if ((index + numOfCharToShift) > string.length()){
            return this.string.charAt((index + numOfCharToShift) - string.length());
        } else {
            return this.string.charAt(index + numOfCharToShift);
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sub = new StringBuilder();
        if ((start + numOfCharToShift) < string.length()) {
            sub.append(string.subSequence(start + numOfCharToShift, string.length()));
            sub.append(string.subSequence(0, start + numOfCharToShift));
        } else {
            sub.append(string.subSequence(start + numOfCharToShift - string.length(), string.length()));
            sub.append(string.subSequence(0, start + numOfCharToShift - string.length()));
        }
        return sub.toString();
    }
}
/*
Create a CharSequence.ShiftedCharSequence class implementing this interface
This CharSequence can be constructed using the following arguments:
a String (that is to be shifted)
a number (which defines how many characters to shift)
Implement the methods so that the sequence is shifted by the defined number of characters

 */