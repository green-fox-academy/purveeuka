import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    ArrayList<Integer> list;

    public Sum() {

        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    public int sum(ArrayList<Integer> list){
        int summary = 0;
        if(list == null) {
        } else {
            for (int i = 0; i < list.size(); i++) {
                summary += list.get(i);
            }
        }
        return summary;
    }
}
/*
    Create a sum method in your class which has an ArrayList of Integers as parameter
        It should return the sum of the elements in the list
        Follow these steps:
        Add a new test case
        Instantiate your class
create a list of integers
                use the assertEquals to test the result of the created sum method
                Run them
                Create different tests where you test your method with:
        an empty list
        a list that has one element in it
        a list that has multiple elements in it
        a null
        Run them
        Fix your code if needed
 */