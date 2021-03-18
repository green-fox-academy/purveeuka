package FleetOfThings;

public class FleetOfThings {

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

        System.out.println(fleet);
    }
}
// - You have the `FleetOfThings.Thing` class
// - You have the `FleetOfThings.Fleet` class
// - You have the `FleetOfThings.FleetOfThings` class with a `main()` method
// - Download those, use those
// - Create a fleet in the main() method

// - Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch