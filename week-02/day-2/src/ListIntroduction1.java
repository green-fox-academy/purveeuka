import java.util.ArrayList;


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

        for (String i: names) {
            System.out.println(i);
        }

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
 */