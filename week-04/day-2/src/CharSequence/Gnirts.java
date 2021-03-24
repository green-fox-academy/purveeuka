package CharSequence;

public class Gnirts implements CharSequence{
    private  String string;
    CharSequence reversedSequence;

    public Gnirts(String sequence) {
        this.string = sequence;
    }
    public  String getSequence() {
        return string;
    }
    public void setSequence(String sequence) {
        this.string = sequence;
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(string.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sub = new StringBuilder(string.subSequence(0, string.length()));
        return sub.reverse();
    }
}
/*
    Create a CharSequence.Gnirts class implementing this interface
It should have one String field that can be set via the constructor
Your solution should be a class that represents a reversed String. Implement its methods accordingly.
E.g. if the CharSequence.Gnirts is constructed with the String "example" then the character at the 2nd index is 'p'
In a main method try out all the methods

 */