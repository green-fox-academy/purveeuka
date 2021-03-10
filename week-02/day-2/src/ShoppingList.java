import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> listItems = new ArrayList<>();
        listItems.add("Eggs");
        listItems.add("milk");
        listItems.add("fish");
        listItems.add("apples");
        listItems.add("bread");
        listItems.add("chicken");

        if (listItems.contains("milk")){
            System.out.println("Yes, we have milk.");
        } else {
            System.out.println("No, we don't have milk.");
        }

        if (listItems.contains("bannas")){
            System.out.println("Yes, we have bananas.");
        } else {
            System.out.println("No, we don't have bananas..");
        }
    }
}
/*
We are going to represent a shopping list in a list containing strings.

Create a list with the following items.
Eggs, milk, fish, apples, bread and chicken
Create an application which solves the following problems.
Do we have milk on the list?
Do we have bananas on the list?

 */