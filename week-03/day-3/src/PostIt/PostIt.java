package PostIt;

public class PostIt {
    private String backgroundColor;
    private String text;
    private String textColor;

    public PostIt(String backgroundColor, String text, String textColor){
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
    public void printColor() {
        System.out.println(this.backgroundColor);
    }
    public void printText() {
        System.out.println(this.text);
    }
    public void printTextColor() {
        System.out.println(this.textColor);
    }
}
/*
    Create a PostIt.PostIt class that has
        a backgroundColor represented by a string
        a text on it
        a textColor represented by a string
 */