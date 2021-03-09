import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);


        int sum = 0;
        for ( int i =0 ; i < expenses.size(); i++){
            sum = sum + expenses.get(i);
        }
        System.out.println("We spent: " + sum);

        Collections.sort(expenses);
        System.out.println("The greatest expense was: " + expenses.get(expenses.size()-1));
        System.out.println("The cheapest spending was: " + expenses.get(0) );
        System.out.println("The average amount of spending is: " + (sum /= expenses.size()));

    }
}

/*
    We are going to represent our expenses in a list containing integers.

        Create a list with the following items.
        500, 1000, 1250, 175, 800 and 120
        Create an application which solves the following problems.
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings?
 */