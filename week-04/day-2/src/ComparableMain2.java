import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Comparable.Domino;

public class ComparableMain2 {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();

        Collections.sort(dominoes);
        System.out.println(dominoes);
        System.out.println("-----------------------------------------------------");
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
/*
    Check out what is the Comparable interface
Get your Comparable.Domino class
Implement the Comparable interface on the Comparable.Domino
        why? we want to compare based on the result of Comparable.Domino.compareTo()
        more info here
        First compare the first value and then the second
// the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
 */