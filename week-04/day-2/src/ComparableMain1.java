import Comparable.*;

public class ComparableMain1 {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing task1 = new Thing("Get milk");
        Thing task2 = new Thing("Remove the obstacles");
        Thing task3 = new Thing("Stand up");
        Thing task4 = new Thing("Eat lunch");

        fleet.add(task1);
        fleet.add(task2);
        fleet.add(task3);
        fleet.add(task4);

        task3.complete();
        task4.complete();

        fleet.sortThings();
        System.out.println(fleet);
    }
}