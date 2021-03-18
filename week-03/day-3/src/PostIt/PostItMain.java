package PostIt;

public class PostItMain {
    public static void main(String[] args) {
        PostIt orange = new PostIt("orange", "idea 1", "blue");
        orange.printColor();
        orange.printText();
        orange.printTextColor();
        System.out.println("----------------------------");

        PostIt pink = new PostIt("pink", "Awesome", "black");
        pink.printColor();
        pink.printText();
        pink.printTextColor();
        System.out.println("----------------------------");

        PostIt yellow = new PostIt("yellow", "Superb!", "green");
        yellow.printColor();
        yellow.printText();
        yellow.printTextColor();
    }
}
/*
    Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"
 */