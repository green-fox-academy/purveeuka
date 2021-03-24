package Printable;

public class Domino implements Printable {
    private int rightSide;
    private int leftSide;

    public Domino(){
    }

    public Domino(int rightSide, int leftSide){
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.getRightSide() + ", B side: " + this.getLeftSide());
    }

    public int getRightSide() {
        return rightSide;
    }

    public int getLeftSide() {
        return leftSide;
    }
}
