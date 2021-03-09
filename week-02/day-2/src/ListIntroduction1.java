import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        System.out.println("-------------");

        names.add("William");
        System.out.println(names.isEmpty());
        System.out.println("---------------");

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());
        System.out.println("--------------");

        System.out.println(names.get(2));
        System.out.println("------------");

        for (String i : names) {
            System.out.println(i);
        }

        int j = 1;
        for (String i : names) {
            System.out.println(j + ". " + i);
            j++;
        }

        names.remove(1);
        System.out.println(names);
        System.out.println("------------");

        Collections.reverse(names);
        for (String i : names) {
            System.out.println(i);
        }
        System.out.println("------------");
        names.removeAll(names);
        System.out.println(names);
    }
}

/*
    Create an empty list which will contain names (strings)
    Print out the number of elements in the list
        Add William to the list
        Print out whether the list is empty or not
        Add John to the list
        Add Amanda to the list
        Print out the number of elements in the list
        Print out the 3rd element
        Iterate through the list and print out each name

        Iterate through the list and print
           1. William
           2. John
           3. Amanda
        Remove the 2nd element
        Iterate through the list in a reversed order and print out each name
        Remove all elements
*/