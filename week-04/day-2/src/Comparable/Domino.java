package Comparable;

public class Domino  implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public int compareTo(Domino dominoO) {
        if (this.getLeftSide() == dominoO.getLeftSide()) {
            if (this.getRightSide() > dominoO.getRightSide()) {
                return 1;
            } return -1;
        } else if (this.getLeftSide() > dominoO.getLeftSide()) {
            return 1;
        }
        return -1;
    }
}